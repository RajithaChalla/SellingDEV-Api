package com.warehouse.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Article {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	private String id;
    private String artName;
    private int stock;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArtName() {
		return artName;
	}
	public void setArtName(String artName) {
		this.artName = artName;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Article(String id, String artName, int stock) {
		super();
		this.id = id;
		this.artName = artName;
		this.stock = stock;
	}
	
	
	
	
    
    

}
