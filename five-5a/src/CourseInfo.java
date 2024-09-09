@interface CourseInfo {
    String courseName();
    String instructor() default "Unknown";
}

@CourseInfo(courseName = "Advanced Java", instructor = "Dr. Smith")
class AdvancedJavaCourse extends Course {
    public AdvancedJavaCourse(int courseId) {
        super("Advanced Java", courseId);
    }

    // Additional functionalities related to the Advanced Java course
}
