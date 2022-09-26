package Qution1;

public class StudentInfo {

        private  int id;
        private String name;
        private int rollNo;
        public StudentInfo(int id, String name, int rollNo) {
            this.id = id;
            this.name = name;
            this.rollNo = rollNo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }
    }

