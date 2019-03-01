package com.tutorapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tutor {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String gender;
	private String occupation;
	
	public Tutor(String userName,String firstName,String lastName,String email,String gender,String occupation){
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.userName=userName;
		this.gender=gender;
		this.occupation=occupation;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
