package ElearningPortal;

public class Course {
    String coursename;
    String Trainer;

    public Course(String coursename, String trainer) {
        this.coursename = coursename;
        Trainer = trainer;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "coursename='" + coursename + '\'' +
                ", Trainer='" + Trainer + '\'' +
                '}';
    }
}
