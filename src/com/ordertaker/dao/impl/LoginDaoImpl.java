package com.ordertaker.dao.impl;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ordertaker.dao.LoginDao;
import com.ordertaker.entity.User;

public class LoginDaoImpl  implements LoginDao{
	
	private SqlMapClient sqlMapClient;
		
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@Override
	public String checkUsername(String userId) throws SQLException {
		System.out.println("okokDaoImpl");
		String inputId = (String) this.getSqlMapClient().queryForObject("getUserId", userId);
		return inputId;
	}
	
	@Override
	public User getUserInfo(Map<String, Object> userInfo) throws SQLException {
		User user = new User();
		try {
			user = (User) this.getSqlMapClient().queryForObject("getLoginInfo", userInfo);
			return user;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
