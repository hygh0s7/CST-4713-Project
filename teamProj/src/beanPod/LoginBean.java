package beanPod;

import java.util.ArrayList;

public class LoginBean {
	private String studentID;
	private ArrayList<CourseBean> enrolledCourses = new ArrayList<>();

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public ArrayList<CourseBean> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(ArrayList<CourseBean> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	
	
}
