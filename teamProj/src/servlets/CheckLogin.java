package servlets;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	


	public Hashtable<String, CourseBean> enrollmentLog = new Hashtable();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String studId = request.getParameter("StudentId");
		String nullId = "";

		
		try {

			DBConnection db = new DBConnection();
			enrollmentLog = db.populateCourses();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		out.print(enrollmentLog.size());
			
		
		
	
	}

}
