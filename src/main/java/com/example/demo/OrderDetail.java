package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(OrderDetailId.class)
public class OrderDetail {

	@Id
	private int productId;

	@Id
	private int orderId;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	
	@Override
	public String toString() {
		return "OrderDetail [productId=" + productId + ", orderId=" + orderId + "]";
	}
	
}
