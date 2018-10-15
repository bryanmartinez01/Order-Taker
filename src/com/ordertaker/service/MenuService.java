package com.ordertaker.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface MenuService {
	void getDishes(HttpServletRequest request) throws SQLException;
	void getDishesByDay(HttpServletRequest request) throws SQLException;
}
