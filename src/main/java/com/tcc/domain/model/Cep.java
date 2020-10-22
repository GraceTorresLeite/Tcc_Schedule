package com.tcc.domain.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public class Cep {
	public ResponseEntity<Address> getCep(@PathVariable(name = "cep") String cep) {

	    return null;
	  }

}
