package com.ordertaker.entity;

import java.math.BigDecimal;

public class Dish {
	
	private int dishId;
	private String dishCode;
	private String dishName;
	private String dishDesc;
	private BigDecimal dishPrice;
	private String dishAvailability;
	private String dishPicture;
	
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishCode() {
		return dishCode;
	}
	public void setDishCode(String dishCode) {
		this.dishCode = dishCode;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishDesc() {
		return dishDesc;
	}
	public void setDishDesc(String dishDesc) {
		this.dishDesc = dishDesc;
	}
	public BigDecimal getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(BigDecimal dishPrice) {
		this.dishPrice = dishPrice;
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
