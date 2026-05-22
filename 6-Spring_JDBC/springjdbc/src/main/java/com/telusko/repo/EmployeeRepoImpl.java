package com.telusko.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.telusko.entity.Employee;

@Repository
public class EmployeeRepoImpl implements IEmployeeRepo
{
	private static final String SQL_QUERY = "SELECT * FROM Employee";
	@Autowired
	private DataSource dataSource;
	private ArrayList<Employee> list;
	Connection connection=null;

	@Override
	public List<Employee> getEmployeeInfo()
	{
		// Spring + JDBC
		try
		{
			System.out.println("Implementation of datasource "+ dataSource.getClass().getName());
			//register//load --> //Connection
			connection = dataSource.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs = pstmt.executeQuery();
			list=new ArrayList<>();
			
			while(rs.next())
			{
				Employee emp=new Employee();
//				int id=rs.getInt(1);
//				emp.setId(id);
				
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setCity(rs.getString(3));
				
				list.add(emp);
				
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try 
			{
				connection.close();
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
		}
		
		return list;
	}

}
