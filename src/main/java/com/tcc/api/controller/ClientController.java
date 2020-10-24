package com.tcc.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.tcc.domain.model.Client;
import com.tcc.domain.repository.ClientRepository;

@RestController
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> list(){
		return clientRepository.findAll();
		
	}
	
	@GetMapping("/clients/{clientId}")
	public Client getClient(@PathVariable Long clientId) {
		Optional<Client> clientOpt = clientRepository.findById(clientId);
		return clientOpt.orElse(null);
		
	}

}
