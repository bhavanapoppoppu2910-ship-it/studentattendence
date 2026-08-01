public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        Attendance attendance = new Attendance();

        Student s1 = new Student(101, "Rahul", "CSE");
        Student s2 = new Student(102, "Anjali", "ECE");

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("\nStudent Details");
        service.displayStudents();

        attendance.markAttendance(101, 25);
        attendance.markAttendance(102, 23);

        System.out.println("\nAttendance");
        attendance.showAttendance();
    }
}
