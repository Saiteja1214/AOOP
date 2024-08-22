package com.StudentInformation;

public class SimpleEnrollmentManager implements EnrollmentManager{
	

	public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
