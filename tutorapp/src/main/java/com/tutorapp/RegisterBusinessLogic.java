package com.tutorapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterBusinessLogic {
	Statement st;
	Connection con;
	int i;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String userName;
	private String gender;
	private String occupation;
	public RegisterBusinessLogic(String firstName,String lastName,String email,String password,String userName,
			String gender,String occupation){
		
			
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
		this.userName=userName;
		this.gender=gender;
		this.occupation=occupation;
	}
	ResultSet rs=null;
	MyConnection jdbc=new MyConnection();
	public String execution() throws SQLException{
			
			try{
				con=jdbc.jdbcConnection();
				if(con==null){
					return "error.jsp";
				}
				st=con.createStatement();
				rs=st.executeQuery("select * from hb_student_tracker.tutor where username='"+userName+"'");
				if(!rs.next()){
				st.executeUpdate("insert into hb_student_tracker.tutor values ('"+userName+"','"+firstName+"','"+lastName+"','"
						+gender+"','"+password+"','"+occupation+"','"+email+"')");}
				else{
					return "userexist.jsp";
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(st!=null){
				st.close();}
				con.close();
			}
			return "success.jsp";
	}
}



//String firstName,String lastName,String email,String password,
//String userName,String gender,String occupation