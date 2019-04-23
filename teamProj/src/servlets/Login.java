package servlets;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import JDBCHelper.DBConnection;

public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		System.out.println("Hello!");
		
		String query = "select * from Enrollment";
		DBConnection db = new DBConnection();
		Connection conn = db.establishDBConnection();
		Statement useStatement = conn.createStatement();
		
		Statement selectStatement = conn.createStatement();
		ResultSet rs = selectStatement.executeQuery(query);
		
		while(rs.next()){
			System.out.println(rs.getString("ssn"));
		}
		
	}
	
}
