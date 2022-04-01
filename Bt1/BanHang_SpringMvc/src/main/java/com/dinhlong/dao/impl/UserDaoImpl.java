package com.dinhlong.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dinhlong.dao.UserDao;
import com.dinhlong.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addUser(User user) {
		String sql="INSERT INTO USER(NAME,PHONE_NUMBER) VALUES(?,?)";
		jdbcTemplate.update(sql,user.getName(),user.getPhoneNumber() );
	}

	public void updateUser(User user) {
		String sql="UPDATE USER "
				+ "SET NAME=?,PHONE_NUMBER=? WHERE ID=? ;";
		jdbcTemplate.update(sql,user.getName(),user.getPhoneNumber(), user.getId());
		
	}

	public void deleteUser(int id) {
		String sql="DELETE FROM USER WHERE ID=? ;";
		jdbcTemplate.update(sql,id);
		
	}

	public User getUserById(int id) {
		String sql="SELECT * FROM  USER "
				+ "WHERE ID=? ;";
		return jdbcTemplate.queryForObject(sql, new Object[] {id},new RowMapper<User>(){

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(rs.getInt("ID"));
				user.setName(rs.getString("NAME"));
				user.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				return user;
			}
			
		});
	}

	public List<User> getAllUsers() {
		String sql="SELECT * FROM USER;";
		
		return jdbcTemplate.query(sql, new Object[] {},new RowMapper<User>(){

			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(rs.getInt("ID"));
				user.setName(rs.getString("NAME"));
				user.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				return user;
			}
			
		});
	}
	
}
