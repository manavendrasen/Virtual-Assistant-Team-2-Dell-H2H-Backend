package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	
     
	@Id
	@GeneratedValue
	private int orderId;
	 private Date orderDate ;
	 private boolean issueExists;

	private int quantity;
	  private String houseAddress ;
	 private String country ;
	 private String  state ;
	 private String city ;
	 private int zipCode ;
	 private String orderEmail ;
	  private String vendorAdress;
	  
		 public boolean isIssueExists() {
				return issueExists;
			}
			public void setIssueExists(boolean issueExists) {
				this.issueExists = issueExists;
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
	public String getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getOrderEmail() {
		return orderEmail;
	}
	public void setOrderEmail(String orderEmail) {
		this.orderEmail = orderEmail;
	}
	public String getVendorAdress() {
		return vendorAdress;
	}
	public void setVendorAdress(String vendorAdress) {
		this.vendorAdress = vendorAdress;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", issueExists=" + issueExists
				+ ", quantity=" + quantity + ", houseAddress=" + houseAddress + ", country=" + country + ", state="
				+ state + ", city=" + city + ", zipCode=" + zipCode + ", orderEmail=" + orderEmail + ", vendorAdress="
				+ vendorAdress + "]";
	}
}
