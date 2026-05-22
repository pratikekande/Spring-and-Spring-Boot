package com.telusko.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.telusko.entity.Employee;

@Repository
public class EmployeeRepo2 implements IEmployeeRepo
{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	private String sql="INSERT INTO EMPLOYEE(id,name,city)VALUES(4, 'Sam','bengaluru')";
	
	private String sql="INSERT INTO EMPLOYEE(id, name, city)VALUES(?,?,?)";

	
	public void input(Employee emp)
	{
//		int id=emp.getId();
//		String name=emp.getName();
//		String city=emp.getCity();
		jdbcTemplate.update(sql,emp.getId(), emp.getName(), emp.getCity());
	}
	
	@Override
	public List<Employee> getEmployeeInfo()
	{
		
		return null;
	}

}
