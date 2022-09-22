package SecondQuetion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestMemberMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        ArrayList<MemberDetails> s=new ArrayList<>();
        while(i!=1) {
            System.out.println("1.Add member 2.View all members 3.View by address 4.Exit");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:System.out.println("Enter member details(name,regno,address");
                       s.add(new MemberDetails(sc.next(),sc.nextInt(),sc.next()));
                       break;
                case 2:System.out.println("All registered members");
                    Iterator<MemberDetails> itr=s.iterator();
                    while(itr.hasNext())
                    {
                        System.out.println(itr.next());
                    }
                    break;
                case 3:System.out.println("Enter address to see the members");
                    String add=sc.next();
                    Iterator<MemberDetails> itr1=s.iterator();
                    while(itr1.hasNext()) {
                        MemberDetails membr=itr1.next();
                        if(membr.getAddress().equals(add))
                            System.out.println(membr);
                    }
                    break;
                case 4:i=1;
                break;
                default:System.out.println("Wrong option selected");
                break;

            }
        }
    }
}
