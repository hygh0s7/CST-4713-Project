package beanPod;

import java.util.ArrayList;

public class LoginBean {
	private int studentID;
	private ArrayList<CourseBean> enrolledCourses = new ArrayList<>();

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public ArrayList<CourseBean> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(ArrayList<CourseBean> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
	
	
	
}
