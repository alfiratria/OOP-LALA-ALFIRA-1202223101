import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Pak Yoga Raditya", 101);
        Admin admin = new Admin("Hudza", 102);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student name:");
        String studentName = scanner.nextLine();

        int studentId = 0;
        boolean validId = false;

        while (!validId) {
            try {
                System.out.println("Enter student ID:");
                studentId = scanner.nextInt();
                validId = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer ID.");
                scanner.nextLine(); 
            }
        }

        scanner.nextLine(); 

        System.out.println("Enter courses to enroll in (separated by commas):");
        String coursesInput = scanner.nextLine();
        String[] courses = coursesInput.split(", ");

        Student student = new Student(studentName, studentId);

        for (String course : courses) {
            student.enrollInCourse(course);
        }

        System.out.println(student.getUserDetails());

        displayCourseAndStudents();

        teacher.teachClass("Math");
        admin.manageSystem("university system");

        scanner.close();
    }

    private static void displayCourseAndStudents() {
        String[][] courseData = {
                {"101", "Pemrogaman Berbasis Objek", "Fadly", "Metti"},
                {"102", "Desain Jaringan Komputer", "Husna", "Ramiza"}
        };

        for (String[] course : courseData) {
            System.out.println("Course ID: " + course[0] + ",");
            System.out.println("Course Name: " + course[1]);

            for (int i = 2; i < course.length; i++) {
                System.out.println("Student: " + course[i]);
            }

            System.out.println();
        }
    }
}
