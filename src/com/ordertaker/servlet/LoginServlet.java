package com.ordertaker.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ordertaker.service.LoginService;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5750413088495296210L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"/com/store/resource/applicationContext.xml");
		LoginService loginService = (LoginService) applicationContext.getBean("getLogin");
		HttpSession session = request.getSession();
		String page = "";
		try {
			loginService.getUserInfo(request);
			switch ((Integer) request.getAttribute("loginStatus")) {
			case 0:
				page = "index.jsp";
				request.setAttribute("systemMessage", "Invalid username and/or password.");
				break;
			case 1:
				response.setStatus(201);
				if (session.getAttribute("currentUserFN") != null || session.getAttribute("currentUserFN") != "") {
					session.setAttribute("currentUser", session.getAttribute("currentUserFN"));
					page = "index.jsp";
				}
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
	}

}
