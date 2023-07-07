package com.Damera.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Damera.request.Passenger;
import com.Damera.response.Ticket;
import com.Damera.service.BookingService;

@RestController
public class BookingRestController {
	
	@Autowired
	private BookingService service;
	
	
	@PostMapping(value = "/book",
		consumes = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	
	@GetMapping(value = "/ticket/{id}",
			produces = "application/json")
	public Ticket getTicket(@PathVariable Integer id){
		Ticket ticket = service.getTicketById(id);
		System.out.println(ticket);
		return ticket;
	}

}
