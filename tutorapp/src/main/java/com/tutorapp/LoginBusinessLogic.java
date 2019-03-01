package com.tutorapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginBusinessLogic {
	private String userName;
	private String password;
	private Connection con;
	private Statement st;
	private ResultSet rs;
	public LoginBusinessLogic(String userName,String password){
		
		this.password=password;
		this.userName=userName;
	}
	MyConnection jdbc=new MyConnection();
	String occupation;
	int j=0;
	public static ArrayList<Tutor> tutorList=new ArrayList<Tutor>();
	public String execution() throws SQLException{
		
			
			try{
				con=jdbc.jdbcConnection();
				if(con==null){
					return "error.jsp";
				}
				st=con.createStatement();
				rs=st.executeQuery("select * from hb_student_tracker.tutor where username='"+userName+"'"
						+ " AND password='"+password+"'");
				if(rs==null){
					rs=null;
					return "errorlogindetails.jsp";
				}
				else{
					while(rs.next()){
						occupation=rs.getString("occupation");
						//System.out.println(occupation);
							if(occupation.equals("s")){
								//rs.beforeFirst();
								//rs.next();
								tutorList.clear();
								String userName=rs.getString("username");
								String firstName =rs.getString("firstname");
								String lastName=rs.getString("lastname");
								String email=rs.getString("email");
								String gender=rs.getString("sex");
								String occupation=rs.getString("occupation");
								Tutor tutor=new Tutor(userName,firstName,lastName,email,gender,occupation);
								tutorList.add(tutor);
								return "student.jsp";
							}
							else{
								ResultSet rs2=st.executeQuery("select * from hb_student_tracker.tutor");
								tutorList.clear();
								while(rs2.next())
								{
									String userName=rs2.getString("username");
									String firstName =rs2.getString("firstname");
									String lastName=rs2.getString("lastname");
									String email=rs2.getString("email");
									String gender=rs2.getString("sex");
									String occupation=rs2.getString("occupation");
									Tutor tutor=new Tutor(userName,firstName,lastName,email,gender,occupation);
									tutorList.add(tutor);
								}
								return "tutor.jsp";
							}
						}
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				st.close();
				con.close();
			}
			return "errorlogindetails.jsp";
			
	}
	
}
