package com.ordertaker.service.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.ordertaker.dao.MenuDao;
import com.ordertaker.service.MenuService;

public class MenuServiceImpl implements MenuService{

	private MenuDao menuDao;

	public MenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
	@Override
	public void getDishes(HttpServletRequest request) throws SQLException {
		request.setAttribute("dishesList", menuDao.getDishes());
	}

	@Override
	public void getDishesByDay(HttpServletRequest request) throws SQLException {
		// TODO Auto-generated method stub
		String day = "";
		switch (request.getParameter("param")) {
		case "mon":
			day = "M";
			break;
		case "tue":
			day = "T";
			break;
		case "wed":
			day = "W";
			break;
		case "thu":
			day = "Th";
			break;
		case "fri":
			day = "F";
			break;
		default:
			break;
		}
		
		request.setAttribute("dishesList", menuDao.getDishesByDay(day));
	}
}
