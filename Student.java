public class Student {
    private String name;
    private double grade;
    private String course;

    public Student(String name, double grade, String course) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    // Getters
    public String getName() { return name; }
    public double getGrade() { return grade; }
    public String getCourse() { return course; }

    @Override
    public String toString() {
        return "Student: " + name + " | Course: " + course + " | Grade: " + grade;
    }
}