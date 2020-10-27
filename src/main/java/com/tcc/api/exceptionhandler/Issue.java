package com.tcc.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)//não incluir na resposta quando for null
public class Issue {
	
	private Integer status;
	private LocalDateTime date;
	private String title;
	private List<Field> fields;
	
	public static class Field{
		private String name;
		private String message;
		
		public Field(String name, String message) {
			super();
			this.name = name;
			this.message = message;
		}
		
		
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Field> getFields() {
		return fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
	

}
