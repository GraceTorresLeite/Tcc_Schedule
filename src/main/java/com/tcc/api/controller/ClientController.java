package com.tcc.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.domain.exception.NegocioException;
import com.tcc.domain.model.Client;
import com.tcc.domain.service.AddressService;
import com.tcc.domain.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private AddressService addressService;
	
	private static final String VIEWS_CLIENT_CREATE_OR_UPDATE_FORM = "clients/createOrUpdateClientForm";
	
	@GetMapping("/clients")
	public String listClient(Model model){
		model.addAttribute("clientList",clientService.listClient());
		return "/listClient";
		
	}
	
	@GetMapping("/{clientId}")
	public String getClient(@PathVariable Integer clientId, Model model) {
		ResponseEntity<Client> client =clientService.getClient(clientId);
		model.addAttribute("client", client );
		return "clientDetails";
			
	}
	
	@PostMapping("/clients/new")
	@ResponseStatus(HttpStatus.CREATED)
	public String addClient(@Valid @RequestBody Client client, Model model) {
		 clientService.save(client);
		 model.addAttribute("client", client);
		 return VIEWS_CLIENT_CREATE_OR_UPDATE_FORM;
		
	}
	
	@PutMapping("/{clientId}")
	public String update(@Valid @PathVariable Integer clientId, 
			@RequestBody Client client, Model model){
		
		if(!clientService.getClient(clientId).equals(client)) {
			throw new NegocioException("Este cliente não possui cadastro");
		}
		client.setId(clientId);
		client= clientService.save(client);
		ResponseEntity.ok(client);
		return VIEWS_CLIENT_CREATE_OR_UPDATE_FORM;
	
	}
	
	
	@DeleteMapping("/{clientId}")
	public String delete(@PathVariable Integer clientId, Client client){
		if(!clientService.getClient(clientId).equals(client)) {
			throw new NegocioException("Este cliente não possui cadastro");
		}
		clientService.delete(clientId);
		ResponseEntity.noContent().build();
		return "/client/listClient";
		
	}

}
