package com.ordertaker.dao.impl;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ordertaker.dao.LoginDao;

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
		String inputId = (String) this.getSqlMapClient().queryForObject("getUserInfo", userId);
		return inputId;
	}

}
