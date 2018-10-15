package com.ordertaker.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ordertaker.dao.LoginDao;
import com.ordertaker.entity.User;
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
		String error = "";
		HttpSession session = request.getSession();
		Map<String, Object> user = new HashMap<>();
		user.put("userId", request.getParameter("userId"));
		user.put("password", request.getParameter("password"));
		System.out.println(request.getParameter("userId"));
		System.out.println(request.getParameter("password"));
		try {
			System.out.println("servImpl");
			String inputUserId = loginDao.checkUsername(request.getParameter("userId"));
			if (inputUserId != null) {
				User userInfo = loginDao.getUserInfo(user);
				System.out.println(user.get("password").toString());

				if (userInfo.getUserPassword().equalsIgnoreCase(user.get("password").toString())) {
					request.setAttribute("status", "ok");
					session.setAttribute("firstName", userInfo.getUserFirstName());
					session.setAttribute("lastName", userInfo.getUserLastName());
					session.setAttribute("accesLevel", userInfo.getUserAccessLevel());
					session.setAttribute("emailAddress", userInfo.getUserEmail());
				} else {
					request.setAttribute("status", "fail");
					request.setAttribute("systemMessage", "Invalid Username or Password!");
				}
			}
		} catch (Exception e) {
			 error = "Internal error occur while logging in! Try again later.";
			e.printStackTrace();
		}finally{
			session.setAttribute("systemError", error);
		}
	}
}
