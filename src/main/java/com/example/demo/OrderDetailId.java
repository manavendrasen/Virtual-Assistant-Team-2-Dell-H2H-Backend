package com.example.demo;

import java.io.Serializable;
import java.util.Objects;




public class OrderDetailId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int productId;

	private int orderId;
	
	
	public OrderDetailId(){
		productId=0;
		orderId=0;
	}
	
	
	public OrderDetailId(int productId,int orderId) {
		this.productId=productId;
		this.orderId=orderId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(orderId, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetailId other = (OrderDetailId) obj;
		return orderId == other.orderId && productId == other.productId;
	}




}
