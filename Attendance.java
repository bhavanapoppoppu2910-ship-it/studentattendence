public class Attendance {
HashMap<Integer, Integer> attendance = new HashMap<>();

void markAttendance(int id, int days) {
    attendance.put(id, days);
}

void showAttendance() {
    System.out.println(attendance);
}
