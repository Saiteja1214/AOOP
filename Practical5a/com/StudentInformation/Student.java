package com.StudentInformation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 private int studentId;
	    private String name;
	    private List<Course> enrolledCourses;

	    public Student(int studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	        this.enrolledCourses = new ArrayList<>();
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Course> getEnrolledCourses() {
	        return enrolledCourses;
	    }

	    public void enrollInCourse(Course course) {
	        enrolledCourses.add(course);
	    }
}
