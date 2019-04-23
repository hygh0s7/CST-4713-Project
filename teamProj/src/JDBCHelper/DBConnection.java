package JDBCHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.*;
import java.util.*;

public class DBConnection{
	public Connection establishDBConnection() throws SQLException, ClassNotFoundException{

		String url = "jdbc:sqlserver://s16988308.onlinehome-server.com;databaseName=CUNY_DB";
		String user = "cst4713";
		String password = "password1";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection connect = null;
		Properties connectProp = new Properties();
		connectProp.put("dbms", "sqlserver");
		connectProp.put("user", "cst4713");
		connectProp.put("password", "password1");
		connectProp.put("useS", "sqlserver");
		connect = DriverManager.getConnection(url, user, password);
		
	
		return connect;
	}
}
