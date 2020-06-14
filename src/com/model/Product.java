package com.model;

public class Product {

	String name;
	int productId;
	String productName;
	int productQuantity;
	double productPrice;

	public Product(String name, int productId2, String productName, int productQuantity, double productPrice ) {
		this.name = name;
		this.productId = productId2;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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
