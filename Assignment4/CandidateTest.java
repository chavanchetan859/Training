import java.util.Scanner;

public class CandidateTest{
    public static void main(String[] args) throws CandidateException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name-");
        String nm=sc.next();
        System.out.println("Enter gender-");
        String gender=sc.next();
        System.out.println("Enter salary");
         int sal=sc.nextInt();
         if(sal<10000) {
              throw new CandidateException("Salary cannot be less than 10000");
            }
            else {
                Candidate c = new Candidate(nm, gender, sal);
                System.out.println(c);
            }
    }
}
