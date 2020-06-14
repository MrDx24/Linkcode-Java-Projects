package com.model;

public class Product {
	
	int productId; 
	String productName; 
	int productQuantity; 
	double productPrice; 

	public Product(int productId2, String productName, int productQuantity, double productPrice ) {
		this.productId = productId2; 
		this.productName = productName; 
		this.productQuantity = productQuantity; 
		this.productPrice = productPrice; 
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
