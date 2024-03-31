import java.util.HashMap;
import java.util.Map;

public class StudentCourses {
    private String semester;
    private Map<String, Integer> courses;

    public StudentCourses(String semester) {
        this.semester = semester;
        this.courses = new HashMap<>();
    }

    public void addCourse(String courseName, int marksObtained) {
        courses.put(courseName, marksObtained);
    }

    public void displayCourses() {
        System.out.println("Semester: " + semester);
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println("Course: " + entry.getKey() + ", Marks Obtained: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        StudentCourses studentCourses = new StudentCourses("Fall 2023");
        studentCourses.addCourse("Mathematics", 85);
        studentCourses.addCourse("Physics", 78);
        studentCourses.displayCourses();
    }
}
