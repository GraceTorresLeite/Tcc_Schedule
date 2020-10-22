package com.tcc.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.domain.model.Address;
import com.tcc.domain.model.Client;
import com.tcc.repository.ClientRepository;


@RestController
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	//@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/clients")
	public List<Client> list() throws Exception {
		var cliente1 = new Client();
		cliente1.setId(1L);
		cliente1.setName("João");
		cliente1.setEmail("joao@joao.com");
		cliente1.setPhone("00000");
				
		Address address1 = new Address();	
		address1.setCep("91230-210"); 
		address1.setNumber("2");
		address1.setComplemento("apto 101 bloc c");
					
		cliente1.setAddress(address1);
		
		var cliente2 = new Client();
		cliente2.setId(2L);
		cliente2.setName("Maria");
		cliente2.setEmail("maria@maria.com");
		cliente2.setPhone("00000");
		
		Address address2 = new Address();
		address2.setCep("92000-000");
		address2.setNumber("7");
		address2.setComplemento("quadra C");
		
		cliente2.setAddress(address2);
			
		return Arrays.asList(cliente1,cliente2);
		
	}
	
//	@CrossOrigin(origins = "http://localhost:8080")
//	@GetMapping("/client")
//	public String clientForm(Model model) {
//		model.addAttribute("client", new Client());
//		return "clientForm";
//	}
//	
//	@PostMapping("/clientForm")
//	public String clientSubmit(@ModelAttribute Client client, Model model) {
//		model.addAttribute("client", client);
//		return "clientCreated";
//	}

}
