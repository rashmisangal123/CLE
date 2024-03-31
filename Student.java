import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, String dob) {
        this.name = name;
        this.dob = parseDate(dob);
    }

    private LocalDate parseDate(String dob) {
        DateTimeFormatter formatter;
        if (dob.contains("-")) {
            formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        } else {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        }
        return LocalDate.parse(dob, formatter);
    }

    public int calculateAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dob, now);
        return period.getYears();
    }

    public void displayInfo() {
        int age = calculateAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "2000-05-15");
        student.displayInfo();
    }
}
