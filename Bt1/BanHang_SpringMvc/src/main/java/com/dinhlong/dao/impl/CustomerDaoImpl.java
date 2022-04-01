package com.dinhlong.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dinhlong.dao.CustomerDao;
import com.dinhlong.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	public void addCustomer(Customer customer) {
		String sql="INSERT INTO CUSTOMER(LASTNAME,FIRSTNAME,GENDER,EMAIL,PHONE,BIRTHDAY,ADDRESS) "
				+ "VALUES(?,?,?,?,?,?,?) ;";
		jdbcTemplate.update(sql, customer.getLastname(),customer.getFirstname(),customer.getGender(),
				customer.getEmail(),customer.getPhone(),customer.getBirthday(),customer.getAddress());
	}

	public void updateCustomer(Customer customer) {
		String sql="UPDATE CUSTOMER SET LASTNAME=?,FIRSTNAME=?,GENDER=?,EMAIL=?,PHONE=?,BIRTHDAY=?, ADDRESS=? "
				+ "WHERE ID=? ;";
		jdbcTemplate.update(sql, customer.getLastname(),customer.getFirstname(),customer.getGender(),
				customer.getEmail(),customer.getPhone(),customer.getBirthday(),customer.getAddress(), customer.getId());
		
	}

	public void deleteCustomer(int id) {
		String sql="DELETE FROM CUSTOMER  "
				+ "WHERE ID=? ;";
		jdbcTemplate.update(sql,id);
	}

	public Customer getCustomerById(int id) {
		String sql="SELECT * FROM CUSTOMER WHERE ID=? ;";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new org.springframework.jdbc.core.RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Customer customer = new Customer();
				customer.setId(rs.getString("ID"));
				customer.setLastname(rs.getString("LASTNAME"));
				customer.setFirstname(rs.getString("FIRSTNAME"));
				customer.setGender(rs.getString("GENDER"));
				customer.setEmail(rs.getString("EMAIL"));
				customer.setPhone(rs.getString("PHONE"));
				customer.setBirthday(rs.getString("BIRTHDAY"));
				customer.setAddress(rs.getString("ADDRESS"));
				return customer;
			}
		});
	}

	public List<Customer> getAllCustomers() {
		String sql="SELECT * FROM CUSTOMER ;";
		return jdbcTemplate.query(sql, new Object[] {}, new org.springframework.jdbc.core.RowMapper<Customer>() {

			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Customer customer = new Customer();
				customer.setId(rs.getString("ID"));
				customer.setLastname(rs.getString("LASTNAME"));
				customer.setFirstname(rs.getString("FIRSTNAME"));
				customer.setGender(rs.getString("GENDER"));
				customer.setEmail(rs.getString("EMAIL"));
				customer.setPhone(rs.getString("PHONE"));
				customer.setBirthday(rs.getString("BIRTHDAY"));
				customer.setAddress(rs.getString("ADDRESS"));
				return customer;
			}
		});
	}
	
}
