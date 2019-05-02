package JDBCHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
import beanPod.CourseBean;

public class PopulateCourseRS {
	public static Hashtable<String, CourseBean> populateCourses() throws ClassNotFoundException, SQLException{
		Hashtable<String, CourseBean> answer = new Hashtable<>();
		boolean isInvalid = false;
		
		String query = "select * from Course";
		DBConnection db = new DBConnection();
		Connection conn = db.establishDBConnection();
		
		Statement selectStatement = conn.createStatement();
		ResultSet rs = selectStatement.executeQuery(query);
		CourseBean tempCB = new CourseBean();
		
		while(rs.next()){
			tempCB.setCourseID(rs.getString("courseID"));
			tempCB.setSubjectID(rs.getString("subjectID"));
			tempCB.setCourseCredNum(rs.getInt("numOfCredits"));
			answer.put(rs.getString("courseID"), tempCB);
		}
		
		return answer;
	}
	
}
