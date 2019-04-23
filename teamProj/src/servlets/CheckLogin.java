package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


public class CheckLogin extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String studId = request.getParameter("StudentId");
		String nullId = "";
		
		boolean isInvalid = false;
		
		if( studID = "" || studID == null){
			nullId = "Please Enter A Valid Student ID";
			isInvalid = true;
		}
	}

}
