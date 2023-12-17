import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<String> enrolledCourses = new ArrayList<>();

    public Student(String name, int id) {
        super(name, id);
    }

    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    @Override
    public String getUserDetails() {
        return "Student - " + super.getUserDetails() + ", Enrolled Courses: " + enrolledCourses;
    }
}
