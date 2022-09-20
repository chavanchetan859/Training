public class EmployeeFactory {
    public Employee getInstance(int emp)
    {
        if(emp==1)
            return new PermanentEmployee();
        else if (emp==2)
            return new ContractualEmployee();
        else
            return null;
    }
}
