public class Student {
    public String name;
    public int regNo;
    public String college;

    public Student(String name, int regNo, String college) {
        this.name = name;
        this.regNo = regNo;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", college='" + college + '\'' +
                '}';
    }
}
