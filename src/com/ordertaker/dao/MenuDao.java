package com.ordertaker.dao;

import java.sql.SQLException;
import java.util.List;

import com.ordertaker.entity.Dish;

public interface MenuDao {
	public List<Dish> getDishes() throws SQLException;
	public List<Dish> getDishesByDay(String day) throws SQLException;
}
