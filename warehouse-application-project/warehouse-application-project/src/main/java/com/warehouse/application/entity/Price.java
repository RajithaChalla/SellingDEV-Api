package com.warehouse.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Price {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private String artId;
    private double price;
	public String getArtId() {
		return artId;
	}
	public void setArtId(String artId) {
		this.artId = artId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Price(String artId, double price) {
		this.artId = artId;
		this.price = price;
	}
    
    
    
    
    
    

}
