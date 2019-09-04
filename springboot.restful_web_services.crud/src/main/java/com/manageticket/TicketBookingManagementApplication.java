package com.manageticket;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.manageticket.entities.Ticket;
import com.manageticket.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(TicketBookingManagementApplication.class, args);
		TicketBookingService ticketBookingService = configurableApplicationContext.getBean("ticketBookingService", TicketBookingService.class);
		
		Ticket ticket = new Ticket();
		ticket.setPassengerName("Utsa Rai");
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("Kathmandu");
		ticket.setDestStation("Dolpas");
		ticket.setEmail("utsarai@gmail.com");
		
		ticketBookingService.createTicket(ticket);
	}

}
