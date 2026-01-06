import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Simulating data input
        students.add(new Student("Gabrielle", 9.5, "Computer Science"));
        students.add(new Student("Luca", 7.0, "Data Engineering"));
        students.add(new Student("Marco", 8.2, "Computer Science"));

        System.out.println("--- Student List ---");
        double totalGrades = 0;

        for (Student s : students) {
            System.out.println(s);
            totalGrades += s.getGrade();
        }

        // Data Insights
        double average = totalGrades / students.size();
        System.out.println("\n--- Analytics ---");
        System.out.printf("Average University Grade: %.2f\n", average);
    }
}