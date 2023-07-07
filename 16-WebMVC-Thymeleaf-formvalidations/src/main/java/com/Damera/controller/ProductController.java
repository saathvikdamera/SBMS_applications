package com.Damera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Damera.entity.Product;
import com.Damera.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository repo;
	
	@GetMapping("/")
	public String loadPage(Model model) {
		model.addAttribute("product",new Product());
		return "123";
	}
	
	@PostMapping("/save")
	public String saveProduct(@Validated @ModelAttribute("product")Product product,BindingResult result,Model model) {
		if(result.hasErrors()) {
			return "123";
		}
		product = repo.save(product);
		if(product.getPid() != null ) {
			model.addAttribute("status","Product saved");
		}else {
			model.addAttribute("status","Product saved");
		}
		//model.addAttribute("product",new Product());
		return "123";
	}
	
	@GetMapping("/load")
	public String loadProducts(Model model) {
		model.addAttribute("products",repo.findAll());
		return "showproducts";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("id")Integer id,Model model) {
		repo.deleteById(id);
		if(!repo.existsById(id)) {
			model.addAttribute("delete","Product Deleted");
		}else {
			model.addAttribute("delete","Product not Deleted");
		}
		model.addAttribute("products",repo.findAll());
		return "showproducts";
	}
	
	@GetMapping("/edit")
	public String editProduct(@RequestParam("id")Integer id,Model model) {
		model.addAttribute("product",repo.findById(id));
		return "index";
	}

}
