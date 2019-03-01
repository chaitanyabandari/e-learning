package com.tutorapp;

import java.sql.SQLException;

public class RegisterClass {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userName;
	private String gender;
	private String occupation;
	
	public RegisterClass(String firstName,String lastName,String email,String password,String userName,String gender,
			String occupation) throws SQLException{
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
		this.userName=userName;
		this.gender=gender;
		this.occupation=occupation;
		
	}
	public String registerReturnpage() throws SQLException{
		RegisterBusinessLogic registerBusiness=new RegisterBusinessLogic(firstName, lastName,
				email, password,userName,gender,occupation);			
		String returnPage=registerBusiness.execution();
		return returnPage;
	}
}
