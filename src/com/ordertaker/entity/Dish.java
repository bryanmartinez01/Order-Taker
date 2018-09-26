package com.ordertaker.entity;

import java.math.BigDecimal;

public class Dish {

	private String dishName;
	private BigDecimal dishPrice;
	private String dishDesc;
	private String dishAvailability;
	private String dishPicture;
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public BigDecimal getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(BigDecimal dishPrice) {
		this.dishPrice = dishPrice;
	}
	public String getDishDesc() {
		return dishDesc;
	}
	public void setDishDesc(String dishDesc) {
		this.dishDesc = dishDesc;
	}
	public String getDishAvailability() {
		return dishAvailability;
	}
	public void setDishAvailability(String dishAvailability) {
		this.dishAvailability = dishAvailability;
	}
	public String getDishPicture() {
		return dishPicture;
	}
	public void setDishPicture(String dishPicture) {
		this.dishPicture = dishPicture;
	}
	
	
}
