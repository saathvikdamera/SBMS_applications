package com.Damera.service;

import com.Damera.request.Passenger;
import com.Damera.response.Ticket;

public interface BookingService {

	Ticket bookTicket(Passenger passenger);
	
	Ticket getTicketById(Integer ticketId);
	
}
