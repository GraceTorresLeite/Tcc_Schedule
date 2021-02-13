package com.tcc.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tcc.domain.model.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Integer>{
	@Query("SELECT client FROM Client client left join fetch client.address ORDER BY client.address.name")
	List<Client> findAll();
	
	List<Client> findByName(String name);
	
	Client findBy();
		
	List<Client> findByNameContaining(String name);
	
	@Query("SELECT DISTINCT client FROM Client client left join fetch client.address Where client.id =:id")
	Client findByAddress(@Param("id") Integer id);
	
	Client findByEmail(String email);

}
