public class ContractualEmployee extends Employee{
    @Override
    public double getLoan(double sal) {
        return sal*0.10;
    }
}
