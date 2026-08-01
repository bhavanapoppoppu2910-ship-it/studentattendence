import java.util.ArrayList;

public class StudentService {
ArrayList students = new ArrayList<>();

void addStudent(Student s) {
    students.add(s);
    System.out.println("Student Added Successfully.");
}

void displayStudents() {
    for (Student s : students) {
        s.display();
    }
    }
    }
