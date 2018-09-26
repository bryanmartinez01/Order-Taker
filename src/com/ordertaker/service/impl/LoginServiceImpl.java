package com.ordertaker.service.impl;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.ordertaker.dao.LoginDao;
import com.ordertaker.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;

	@Override
	public void getUserInfo(HttpServletRequest request) throws SQLException {
	
		
	}

}
