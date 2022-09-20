public class PermanentEmployee extends Employee{

    @Override
    public double getLoan(double sal) {
        return sal*0.15;
    }
}
