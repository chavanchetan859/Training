import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestStudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Student> s=new HashSet<>();
        System.out.println("enter no of students-");
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            System.out.println("enter student details(name,regNo,college)");
            s.add(new Student(sc.next(),sc.nextInt(),sc.next()));
        }
        System.out.println("enter college name to see the students");
        String cName=sc.next();
        Iterator<Student> itr=s.iterator();
        while(itr.hasNext()) {
            Student std=itr.next();
            if(std.getCollege().equals(cName))
                    System.out.println(std);
        }
    }
}
