package com.tutorapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
	
	String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
	String user="hbstudent";
	String pass="hbstudent";
	int i;
	Connection con=null;
	Statement st=null;
	
	public Connection jdbcConnection() throws SQLException{
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,user,pass);
				System.out.println("Connection successful");
				return con;		
			} catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			return null;
	}

}
