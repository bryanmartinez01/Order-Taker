package com.ordertaker.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ordertaker.dao.MenuDao;
import com.ordertaker.entity.Dish;

public class MenuDaoImpl implements MenuDao{

	private SqlMapClient sqlMapClient;
	
	public SqlMapClient getSqlMapClient(){
		return sqlMapClient;
	}
	
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishes() throws SQLException {
		List<Dish> dishesList = new ArrayList<>();
		try{
			dishesList = this.getSqlMapClient().queryForList("getDishes");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return dishesList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dish> getDishesByDay(String day) throws SQLException {
		List<Dish> dishesListByDay = new ArrayList<>();
		try{
			dishesListByDay = this.getSqlMapClient().queryForList("getDishesByDay", day);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return dishesListByDay;
	}

}
