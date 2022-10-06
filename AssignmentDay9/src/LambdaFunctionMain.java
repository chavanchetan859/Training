import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaFunctionMain {
    public static void main(String[] args) {
        List<Student> stud=new ArrayList<>();
        stud.add(new Student("Peter","English"));
        stud.add(new Student("Akash","Physics"));
        stud.add(new Student("Jay","Computer Science"));
        stud.add(new Student("Priya","English"));
        Collections.sort(stud,(Student s1,Student s2)->s1.getName().compareTo(s2.getName()));
        System.out.println(stud);
    }
}