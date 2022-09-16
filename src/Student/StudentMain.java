package Student;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Enter rollno,age,name and subject");
int roll=scan.nextInt();
int a=scan.nextInt();
String nam=scan.next();
String sub=scan.next();

System.out.println("Enter marks");
int mark=scan.nextInt();

if(mark<30) {
	System.out.println("Marks less than 30 is not accepeted");
	       }
else
           {
                 Student stud1=new Student(roll, mark,a,nam,sub);
               System.out.println(  stud1.toString());
           }
	}

}
