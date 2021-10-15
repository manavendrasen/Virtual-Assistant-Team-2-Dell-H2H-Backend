package com.example.demo;

import java.sql.Date;

public class Failure {
	

	private int errorId;
	private String errorName;
	private int issueId;
	private int orderId;
	private Date orderDate;
	private int quantity;
	private String productname;
	private String imageUrl;
	private double price;
	
	public int getErrorId() {
		return errorId;
	}
	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}
	public String getErrorName() {
		return errorName;
	}
	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Failure [errorId=" + errorId + ", errorName=" + errorName + ", issueId=" + issueId + ", orderId="
				+ orderId + ", orderDate=" + orderDate + ", quantity=" + quantity + ", productname=" + productname
				+ ", imageUrl=" + imageUrl + ", price=" + price + "]";
	}
	
	
	
}
