package com.warehouse.application.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ArticleQuantity {
	private String id;
    private String artName;
    private int count;
    
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public ArticleQuantity(String id, String artName, int count) {
		this.id = id;
		this.artName = artName;
		this.count = count;
	}
}
