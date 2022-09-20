import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeFactory ef=new EmployeeFactory();
        System.out.println("Select employee type--1.Permanent 2.Contractual");
        Employee pe=ef.getInstance(sc.nextInt());
        if(pe instanceof PermanentEmployee) {
            System.out.println("Enter basic salary for permanent emp--");
            double basic= sc.nextDouble();
            double sal=pe.getSalary(basic);
            System.out.println("Salary of permanent emp=" + sal + "  loan amount=" + pe.getLoan(sal));
        } else if (pe instanceof ContractualEmployee) {
            System.out.println("Enter basic salary for contractual emp--");
            double basic= sc.nextDouble();
            double sal=pe.getSalary(basic);
            System.out.println("Salary of contractual emp=" + sal + "  loan amount=" + pe.getLoan(sal));

        }
        else {
            System.out.println("Wrong option selected.");
        }

    }
}
