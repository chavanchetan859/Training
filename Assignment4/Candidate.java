public class Candidate {
    public String name;
    public String gender;
    public int salary;

    public Candidate(String name, String gender, int salary) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }
}
