package JDBCHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import beanPod.*;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.sun.javafx.collections.MappingChange.Map;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import beanPod.CourseBean;

public class PopulateCourseRS {
	
	public static Hashtable<String, CourseBean> PopulateTable() throws SQLException, ClassNotFoundException{
		
		Hashtable<String, CourseBean> ResultHash = new Hashtable<>();
		
		String query = "select * from Course";
		DBConnection db = new DBConnection();
		Connection conn = db.establishDBConnection();
		
		Statement selectStatement = conn.createStatement();
		ResultSet rs = selectStatement.executeQuery(query);
		
		while (rs.next()) {
			CourseBean temp = new CourseBean();
			temp.setCourseID(rs.getString("courseID"));
			temp.setSubjectID(rs.getString("subjectID"));
			temp.setNumberOfCredits(rs.getInt("numOfCredits"));
			ResultHash.put(rs.getString("courseID"), temp);
		}
		
		return ResultHash;
	}
	
	
	
	@Override
	public String toString() {
		return "PopulateCourseRS [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Hashtable answer = PopulateTable();
		Set<String> keys = answer.keySet();
		for(String key: keys){ 
			System.out.println("Value of " + key + " is: " + ((CourseBean) answer.get(key)).getSubjectID());
		}
	}

}
