package com.app.bookapp.dao;

import org.springframework.data.repository.CrudRepository;


import com.app.bookapp.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
