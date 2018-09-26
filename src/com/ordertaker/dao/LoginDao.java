package com.ordertaker.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ordertaker.entity.User;

public interface LoginDao {

	String checkUsername(String userId) throws SQLException;

	User getUserInfo(Map<String, Object> userInfo) throws SQLException;

}
