package com.tcc.domain.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Currency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service implements Serializable{

	/**
	   * @Currency Deve ser usada para campos que são do tipo Double ou Float 
	   * e cujo objetivo é representar uma unidade monetária. Será aplicada 
       * uma máscara padrão, cujo formato é o da moeda brasileira: R$ 99.999,99.
	   * 
	   * @NotField Caso não haja interesse de que um determinado atributo da 
	   * entidade não seja apresentado em tela, então deve-se informar 
	   * explicitamente ao componente esta intenção usando a anotação @NotField.
	   * Desta forma, este atributo será ignorado e não participará da tela de edição da entidade.
	   * 
	   * @NotList Caso não haja interesse de que um determinado atributo da entidade
	   * não apareça na tabela que exibe as entidades já cadastradas, na tela 
	   * de listagem, como uma coluna, então deve-se informar explicitamente 
	   * ao componente esta intenção usando a anotação @NotList.
	   * 
	   * 
	   * @NotList Caso não haja interesse de que um determinado atributo da entidade 
	   * não apareça na tabela que exibe as entidades já cadastradas, na tela 
	   * de listagem, como uma coluna, então deve-se informar explicitamente 
	   * ao componente esta intenção usando a anotação @NotList.
	   * 
	   */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	@Currency(value = {"BrazilianCurrency"})
	private Double price;
	
	@NotNull
	private String description;

	public Service(String name, Double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Service() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
