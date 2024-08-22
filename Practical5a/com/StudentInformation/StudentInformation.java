package com.StudentInformation;

public class StudentInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create some students
        Student student1 = new UndergraduateStudent(1, "John ");
        Student student2 = new GraduateStudent(2, "Jane ");

        // Create some courses
        Course course1 = new Course(101, "Introduction to JAVA");
        Course course2 = new Course(102, "Advanced Object Oriented Programmin");

        // Enrollment manager
        EnrollmentManager enrollmentManager = new SimpleEnrollmentManager();

        // Enroll students in courses
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);

        // Print enrolled students for each course
        System.out.println("Course: " + course1.getCourseName());
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName());
        }

        System.out.println("Course: " + course2.getCourseName());
        for (Student student : course2.getEnrolledStudents()) {
            System.out.println("Enrolled Student: " + student.getName());
        }
	}

}
