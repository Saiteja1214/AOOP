package si;



import java.util.ArrayList;
import java.util.List;

public class Student extends BaseEntity {
    private String name;
    private List<String> enrolledCourses;

    public Student(String id, String name) {
        super(id);
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(String courseId) {
        enrolledCourses.add(courseId);
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }
}