package com.ordertaker.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {


	void getLonginInfo(HttpServletRequest request) throws SQLException;

}
