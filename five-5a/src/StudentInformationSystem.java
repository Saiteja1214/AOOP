public class StudentInformationSystem {
    public static void main(String[] args) {
        // Creating students
        IStudent student1 = new ScholarshipStudent("Alice", 1, StudentStatus.ACTIVE, 5000);
        IStudent student2 = new InternationalStudent("Bob", 2, StudentStatus.ACTIVE, "Germany");
        
        // Creating courses
        ICourse course1 = new AdvancedJavaCourse(101);
        ICourse course2 = new Course("Science", 102);

        EnrollmentService enrollmentService = new EnrollmentService();
        
        // Enrolling students in courses
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student2, course2);
        
        // Applying special discounts for scholarship students
        if (student1 instanceof SpecialStudent) {
            ((SpecialStudent) student1).applyDiscount();
        }
        
        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        
        // Display enrolled students in course1
        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (IStudent student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
