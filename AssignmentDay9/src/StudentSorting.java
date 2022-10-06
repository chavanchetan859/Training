import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> studList=new ArrayList<>();
        studList.add(new Student("Raj","Physics"));
        studList.add(new Student("Manish","Electrical"));
        studList.add(new Student("Amit","English"));
        studList.add(new Student("Aakash","Biology"));

        List sortedList=studList.stream().filter(s->s.getName().startsWith("A")||s.getName().startsWith("a")).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
