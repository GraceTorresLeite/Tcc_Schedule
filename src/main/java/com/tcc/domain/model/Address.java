package com.tcc.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name= "address")
public class Address implements Serializable{
	
	/*
	 * @CreationTimestamp
	 * @UpdateTimestamp
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  
	  @NotNull
	  @Pattern(regexp="(\\d{5})-\\d{3}")
	  private String cep;
	  @NotNull
	  private String logradouro;
	  @NotNull
	  private String number;
	  
	  private String complemento;
	  @NotNull
	  private String bairro;
	  @NotNull
	  private String localidade;
	  
	  private String uf;
	  
	  private String unidade;
	  
	  private String ibge;
	  
	  private String gia;
	 
	  @Temporal(TemporalType.TIMESTAMP)// converte em TIMESTAMP
	  private LocalDateTime hoje = LocalDateTime.now();
	
	  public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public LocalDateTime getHoje() {
		return hoje;
	}
	public void setHoje(LocalDateTime hoje) {
		this.hoje = hoje;
	}
	  
	
}
