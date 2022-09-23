package ElearningPortal;

public class Student {
    int Enrollment_No;
    String StudentName;
    Course[] courses;

    public Student(int enrollment_No, String studentName, Course[] courses) {
        Enrollment_No = enrollment_No;
        StudentName = studentName;
        this.courses = courses;
    }

    public int getEnrollment_No() {
        return Enrollment_No;
    }

    public void setEnrollment_No(int enrollment_No) {
        Enrollment_No = enrollment_No;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Enrollment_No=" + Enrollment_No +
                ", StudentName='" + StudentName + '\'' +
                ", courses=" + courses +
                '}';
    }
}
