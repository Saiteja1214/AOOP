abstract class AbstractStudent implements IStudent {
    protected String name;
    protected int id;
    protected List<ICourse> enrolledCourses;
    protected StudentStatus status;

    public AbstractStudent(String name, int id, StudentStatus status) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getName () {
        return name;
    }



    @Override
    public int getId() {
        return id;
    }



    @Override
    public void enrollInCourse(ICourse course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
    }



    

    @Override
    public List<ICourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    public StudentStatus getStatus() {
        return status;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayStudentDetails();
}
