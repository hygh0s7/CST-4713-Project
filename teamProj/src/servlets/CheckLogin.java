package servlets;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import JDBCHelper.DBConnection;
import beanPod.CourseBean;
import beanPod.LoginBean;

@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String studId = request.getParameter("StudentId");
		String nullId = "";
		
		Hashtable<String, LoginBean> enrollmentLog = new Hashtable<>();
//		boolean isInvalid = false;
//		
//		String query = "select * from Enrollment";
//		DBConnection db = new DBConnection();
//		Connection conn = db.establishDBConnection();
//		
//		Statement selectStatement = conn.createStatement();
//		ResultSet rs = selectStatement.executeQuery(query);
//		
//		String query = "select * from Enrollment";
//		DBConnection db = new DBConnection();
//		Connection conn = db.establishDBConnection();
//		
//		Statement selectStatement = conn.createStatement();
//		ResultSet rs = selectStatement.executeQuery(query);
//		
		
		
//		while(rs.next()){
//			if(rs.getString("ssn").equals(studId)){
//				if(enrollmentLog.containsKey(studId)){
//					enrollmentLog.get(studId).getEnrolledCourses().add(rs.getString("courseId"));
//				}
//				
//			}
//		}
//		
//
//		
//		if(studId == "" || studId == null ){
//			nullId = "Please Enter A Valid Student ID";
//			isInvalid = true;
//		}
		//else if(){
			
		
		
	
	}

}
