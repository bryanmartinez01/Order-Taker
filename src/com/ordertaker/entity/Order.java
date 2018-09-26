package com.ordertaker.entity;

import java.math.BigDecimal;

public class Order {
	private String orderDate;
	private String orderaddOn;
	private String orderStatus;
	private BigDecimal orderTotal;
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderaddOn() {
		return orderaddOn;
	}
	public void setOrderaddOn(String orderaddOn) {
		this.orderaddOn = orderaddOn;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	
	
}
