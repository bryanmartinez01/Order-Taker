package com.ordertaker.dao;

import java.sql.SQLException;

public interface LoginDao {

	String checkUsername(String userId) throws SQLException;

}
