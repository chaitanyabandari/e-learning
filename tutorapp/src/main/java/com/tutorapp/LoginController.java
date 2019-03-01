package com.tutorapp;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/loginrequest")
	public String login(HttpServletRequest req,HttpServletResponse res) throws SQLException{
		String password=req.getParameter("password");
		String userName=req.getParameter("username");
		LoginClass login=new LoginClass(userName,password);
		String returnPage=login.loginReturnPage();
		return returnPage;
		
	}
	
	
	
	
	@RequestMapping("/registerrequest")
	public String register(HttpServletRequest req,HttpServletResponse res) throws SQLException{
		String firstName=req.getParameter("firstname");
		String lastName=req.getParameter("lastname");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String userName=req.getParameter("username");
		String gender=req.getParameter("gender");
		String occupation=req.getParameter("tutor1");
		RegisterClass register=new RegisterClass(firstName,lastName,email,password,userName,gender,occupation);
		String returnPage=register.registerReturnpage();
		return returnPage;
	}
	

}
