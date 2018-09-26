package com.ordertaker.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ordertaker.dao.LoginDao;
import com.ordertaker.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;
	

	public LoginDao getLoginDao() {
		return loginDao;
	}


	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	@Override
	public void getLonginInfo(HttpServletRequest request) throws SQLException {
		HttpSession session = request.getSession();
		Map<String, Object> user = new HashMap<>();
		user.put("userId", request.getParameter("userId"));
		user.put("password", request.getParameter("password"));	
		
		
		try {
			
			String inputUserId = loginDao.checkUsername(request.getParameter("userId"));	
			if(inputUserId != null){
				
			}
			
			
		} catch (Exception e) {
			session.setAttribute("systemError", "Internal error occur while logging in! Try again later.");
			e.printStackTrace();
		}
	}

}
