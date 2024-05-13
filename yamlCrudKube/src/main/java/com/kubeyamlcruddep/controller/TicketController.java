package com.kubeyamlcruddep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubeyamlcruddep.dao.TicketDao;
import com.kubeyamlcruddep.model.Ticket;

 

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketDao ticketdao;

	@PostMapping("/bookticket")
	@Scheduled(fixedRate = 5000)
	public String BookTicket(@RequestBody List<Ticket> tickets) {
        
		ticketdao.saveAll(tickets);
		return "Ticket Booked:"+tickets.size();

	}

	@GetMapping("/getticket")
	public String getTickets() {
		
		List<Ticket> ts = (List<Ticket>) ticketdao.findAll();
		return "Total tickets Booked so far:"+ts.size();
	}

}
