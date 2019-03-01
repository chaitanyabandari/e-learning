package com.tutorapp;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginClass {
	private String userName;
	private String password;
	private ResultSet rs;
	public LoginClass(String userName,String password) throws SQLException{
		this.userName=userName;
		this.password=password;				
	}	
	public String loginReturnPage() throws SQLException{
		LoginBusinessLogic loginBusiness=new LoginBusinessLogic( userName,password);
		String s1=loginBusiness.execution();
		return s1;
	}

}
