package com.guinevisita.guinevisitaturisticabackend.dto;

import java.util.Date;

public class Reservation {
	
	/**
	 * 
	 * fields
	 * 
	 * **/
	private int id;
	private int id_hotel;
	private int id_client;
	private Date start_date;
	private Date end_date;
	private double total_price;
	
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
	public int getId_hotel() {
		return id_hotel;
	}
	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	/**
	 * Date getters and setters
	 * **/
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	
	
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}	
}
