package com.tcc.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.domain.model.Address;
import com.tcc.domain.model.Client;

@RestController
public class ClientController {
	
		
	@GetMapping("/clients")
	public List<Client> list() throws Exception {
		var cliente1 = new Client();
		cliente1.setId(1L);
		cliente1.setName("João");
		cliente1.setEmail("joao@joao.com");
		cliente1.setPhone("00000");
		
		Address address1 = new Address();
		address1.setCep("91230-210");
		address1.setName("rua Brasil");
		address1.setNumber(2);
		address1.setComplement("apto 101 bloc c");
		address1.setNeighborhood("Vila Jardim");
		address1.setCity("São Leopoldo");
		cliente1.setAddress(address1);
		
		var cliente2 = new Client();
		cliente2.setId(2L);
		cliente2.setName("Maria");
		cliente2.setEmail("maria@maria.com");
		cliente2.setPhone("00000");
		
		Address address2 = new Address();
		address2.setCep("92000-000");
		address2.setName("av Presidente");
		address2.setNumber(7);
		address2.setComplement("quadra C");
		address2.setNeighborhood("Vila Floresta");
		address2.setCity("São Leopoldo");
		cliente2.setAddress(address2);
			
		return Arrays.asList(cliente1,cliente2);
		
	}

}
