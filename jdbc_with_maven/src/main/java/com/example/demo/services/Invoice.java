package com.example.demo.services;

public class Invoice {
	private int invoiceNumber;
	private String CustomerName;
	private double quantity;
	private int productref;
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public double getQuality() {
		return quantity;
	}
	public void setQuality(double quality) {
		this.quantity = quality;
	}
	public int getProductref() {
		return productref;
	}
	public void setProductref(int productref) {
		this.productref = productref;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", CustomerName=" + CustomerName + ", quantity=" + quantity
				+ ", productref=" + productref + "]";
	}
	public Invoice(int invoiceNumber, String customerName, double quality, int productref) {
		super();
		this.invoiceNumber = invoiceNumber;
		CustomerName = customerName;
		this.quantity = quality;
		this.productref = productref;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
}
