package JDBCHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.*;

import beanPod.CourseBean;

import java.util.*;

public class DBConnection{
	private static Connection connect = null;
	
	public DBConnection() throws ClassNotFoundException, SQLException{
		this.establishDBConnection();
	}
	
	public void establishDBConnection() throws SQLException, ClassNotFoundException{

		String url = "jdbc:sqlserver://s16988308.onlinehome-server.com;databaseName=CUNY_DB";
		String user = "cst4713";
		String password = "password1";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//Connection connect = null;
		Properties connectProp = new Properties();
		connectProp.put("dbms", "sqlserver");
		connectProp.put("user", "cst4713");
		connectProp.put("password", "password1");
		//connectProp.put("useS", "sqlserver");
		connect = DriverManager.getConnection(url, user, password);
		
	}
	
	public static Hashtable<String, CourseBean> populateCourses() throws ClassNotFoundException, SQLException{
		Hashtable<String, CourseBean> answer = new Hashtable<>();
		
		String query = "select * from Course";
		
		Statement selectStatement = connect.createStatement();
		ResultSet rs = selectStatement.executeQuery(query);
		
		
		while(rs.next()){
			CourseBean tempCB = new CourseBean();
			tempCB.setCourseID(rs.getString("courseID"));
			tempCB.setSubjectID(rs.getString("subjectID"));
			tempCB.setCourseCredNum(rs.getInt("numOfCredits"));
			answer.put(tempCB.getCourseID(), tempCB);
		}
		
		return answer;
	}
}
