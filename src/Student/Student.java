package Student;

public class Student {
	int rollno,marks,age;
	String name,subject;
	
	public Student(int rollno, int marks, int age, String name, String subject) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", age=" + age + ", name=" + name + ", subject="
				+ subject + "]";
	} 
	

	
}







