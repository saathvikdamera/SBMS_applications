package com.Damera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Damera.request.Passenger;
import com.Damera.response.Ticket;
import com.Damera.service.MtmService;

@Controller
public class MtmController {
	
	@Autowired
	private MtmService service;
	
	@GetMapping("/")
	public String loadIndex(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}

	@PostMapping("/book")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger,Model model) {
		Ticket ticket = service.bookTicket(passenger);
		model.addAttribute("msg","Your Ticket Id :" + ticket.getTicketNum());
		return "index";
	}
	
	@GetMapping("/getticket")
	public String loadTicketPage(Model model) {
		model.addAttribute("ticket",new Ticket());
		return "ticket";
	}
	
	@PostMapping("/getticket")
	public String getTicket(@RequestParam("ticketNo") Integer ticketNum,Model model) {
		Ticket ticket = service.getTicketById(ticketNum);
		model.addAttribute("ticket", ticket);
		return "ticket";
	}
}
