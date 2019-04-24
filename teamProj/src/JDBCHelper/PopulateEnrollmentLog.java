package JDBCHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.Set;

import beanPod.CourseBean;
import beanPod.LoginBean;

public class PopulateEnrollmentLog  {
	
	public static Hashtable<String, LoginBean> PopulateStudentTable() 
			throws SQLException, ClassNotFoundException {
		
		Hashtable<String, LoginBean> ResultStudentTable = new Hashtable<>();
		
		String query = "select * from Enrollment";
		DBConnection db = new DBConnection();
		Connection conn = db.establishDBConnection();
		
		Statement selectStatement = conn.createStatement();
		ResultSet rs = selectStatement.executeQuery(query);
		
		while (rs.next()) {
			LoginBean temp = new LoginBean();
			temp.setStudentID(rs.getString("ssn"));
			//temp.getEnrolledCourses().;
			ResultStudentTable.put(rs.getString("ssn"), temp);
		}
		
		return PopulateStudentTable();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Hashtable answer = PopulateStudentTable();
		Set<String> keys = answer.keySet();
		for(String key: keys) {
			System.out.println("The value of" + key + " is: " +
					((LoginBean) answer.get(key)).getStudentID());
		}
	}
	
	
}
