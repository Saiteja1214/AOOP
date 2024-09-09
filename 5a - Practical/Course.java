package si;



import java.util.ArrayList;
import java.util.List;

public class Course extends BaseEntity {
    private String courseName;
    private List<Student> enrolledStudents;
    private CourseStatus status;

    public Course(String id, String courseName, CourseStatus status) {
        super(id);
        this.courseName = courseName;
        this.status = status;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseStatus getStatus() {
        return status;
    }

    public void enrollStudent(Student student) {
        if (status == CourseStatus.OPEN) {
            enrolledStudents.add(student);
            student.enrollInCourse(getId());
        } else {
            System.out.println("Course is not open for enrollment.");
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
