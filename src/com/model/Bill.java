package com.model;

public class Bill {
	
	double total; 
	double cgst;
	double sgst;
	double finalBill; 

	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public Bill(double total, double cgst, double sgst, double finalBill) {
		// TODO Auto-generated constructor stub
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst; 
		this.finalBill = finalBill; 
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getCgst() {
		return cgst;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public double getFinalBill() {
		return finalBill;
	}

	public void setFinalBill(double finalBill) {
		this.finalBill = finalBill;
	}
	
	
	
	

}
