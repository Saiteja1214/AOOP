package si;

package sis;

public class Main {
    public static void main(String[] args) {
        EnrollmentManager enrollmentManager = new EnrollmentManager();

       
        Student student1 = new Student("1", "Alice");
        Student student2 = new Student("2", "Bob");

        
        enrollmentManager.addStudent(student1);
        enrollmentManager.addStudent(student2);

       
        Course course1 = new Course("101", "Mathematics", CourseStatus.OPEN);
        Course course2 = new Course("102", "Science", CourseStatus.CLOSED);

        
        enrollmentManager.addCourse(course1);
        enrollmentManager.addCourse(course2);

        
        enrollmentManager.enrollStudentInCourse("1", "101"); // Successful Enrollment
        enrollmentManager.enrollStudentInCourse("2", "102"); // Should not enroll, course is closed

       
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}