package com.Damera.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.Damera.request.Passenger;
import com.Damera.response.Ticket;
import com.Damera.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	private Map<Integer,Ticket> map = new HashMap<>();
	
	private static Integer ticketNumber = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		Ticket ticket = new Ticket();
		
		BeanUtils.copyProperties(passenger, ticket);
		ticket.setStatus("CONFIRMED");
		ticket.setPrice(450.0);
		ticket.setTicketNumber(ticketNumber);
		
		map.put(ticketNumber, ticket);
		
		ticketNumber++;
		
		return ticket;
	}

	@Override
	public Ticket getTicketById(Integer ticketId) {
		Ticket ticket = map.get(ticketId);
		return ticket;
	}

}
