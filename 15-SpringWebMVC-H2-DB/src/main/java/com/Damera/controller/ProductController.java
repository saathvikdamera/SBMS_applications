package com.Damera.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Damera.entity.Product;
import com.Damera.repository.ProductRepository;
import com.Damera.request.SearchRequest;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadData(Model model) {
		model.addAttribute("search", new SearchRequest());
		return "index";
	}
	
	@PostMapping("/save")
	public String saveData(@ModelAttribute("search")SearchRequest search,Model model) {
		Product p1 = new Product();
		BeanUtils.copyProperties(search, p1);
		repo.save(p1);
		model.addAttribute("msg", "Data saved");
		return "index";
	}
	
	@GetMapping("/load")
	public String getProducts(Model model) {
		model.addAttribute("products",repo.findAll());
		return "Data";
	}

}
