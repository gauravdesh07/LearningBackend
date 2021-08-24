package com.amdocs.training;

public class Course {
	private int courseId;
	private String courseName;
	private String courseFee;
	private String description;
	private String resources;
	public Course()
	{
		
	}
	public Course( String courseName, String courseFee, String description, String resources) {
		super();
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.description = description;
		this.resources = resources;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResources() {
		return resources;
	}
	public void setResources(String resources) {
		this.resources = resources;
	}
	

}
