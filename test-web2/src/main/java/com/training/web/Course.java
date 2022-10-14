package com.training.web;

public class Course {
private int courseID;
private String courseName;
private int courseDuration;
private int courseFee;
public Course(int courseID, String courseName, int courseDuration, int courseFee) {
	super();
	this.courseID = courseID;
	this.courseName = courseName;
	this.courseDuration = courseDuration;
	this.courseFee = courseFee;
}
public Course() {
	super();
}
public int getCourseID() {
	return courseID;
}
public void setCourseID(int courseID) {
	this.courseID = courseID;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getCourseDuration() {
	return courseDuration;
}
public void setCourseDuration(int courseDuration) {
	this.courseDuration = courseDuration;
}
public int getCourseFee() {
	return courseFee;
}
public void setCourseFee(int courseFee) {
	this.courseFee = courseFee;
}
@Override
public String toString() {
	return "courseID=" + courseID + ", courseName=" + courseName + ", courseDuration=" + courseDuration
			+ ", courseFee=" + courseFee + "]";
}

}
