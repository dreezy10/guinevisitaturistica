package com.guinevisita.guinevisitaturisticabackend.dto;

public class Client {
	
	/**
	 * Fields
	 * 
	 * **/
	
	
	private int id;
	private String full_name;
	private String tel;
	private String email;
	private int total_person;
	
	
	
	/***
	 * getters and setters
	 * 
	 * ****/
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotal_person() {
		return total_person;
	}
	public void setTotal_person(int total_person) {
		this.total_person = total_person;
	}
	
	

	
	
	
	
	
	
	

}
