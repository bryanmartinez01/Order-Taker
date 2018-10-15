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
				"/com/ordertaker/resource/applicationContext.xml");
		LoginService loginService = (LoginService) applicationContext.getBean("getLogin");
		String page = "login.jsp";
		try {
			loginService.getLonginInfo(request);
			if(request.getAttribute("status").equals("ok")){
				request.setAttribute("logStat", "success");
			}else{
				request.setAttribute("logStat", "failed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			request.setAttribute("systemMessage", "Internal error occur!");
		} finally {
			RequestDispatcher rd = request.getRequestDispatcher(page);
			rd.forward(request, response);
		}
	}

}
