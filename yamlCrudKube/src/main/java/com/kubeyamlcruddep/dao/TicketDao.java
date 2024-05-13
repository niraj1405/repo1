package com.kubeyamlcruddep.dao;

import org.springframework.data.repository.CrudRepository;

import com.kubeyamlcruddep.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
