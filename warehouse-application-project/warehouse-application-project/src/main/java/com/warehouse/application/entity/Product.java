package com.warehouse.application.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private String prodId;
    private String productName;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "product_id")
    @ElementCollection
    private List<ArticleQuantity> articles;
    private double price;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public List<ArticleQuantity> getArticles() {
		return articles;
	}
	public void setArticles(List<ArticleQuantity> articles) {
		this.articles = articles;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String prodId, String productName, List<ArticleQuantity> articles, double price) {
		this.prodId = prodId;
		this.productName = productName;
		this.articles = articles;
		this.price = price;
	}
    
    


}
