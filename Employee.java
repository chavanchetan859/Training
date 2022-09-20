public abstract class Employee {
    public double getSalary(double basic)
    {
        return basic-(basic*0.12);
    }
    public abstract double getLoan(double sal);
}
