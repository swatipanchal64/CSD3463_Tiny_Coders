abstract public class Contract {

    abstract public double accumulatedSalary();

    abstract public double annualIncome();

    abstract public void convertFrom(double accumulatedSalary);

    @Override
    abstract public String toString();

}
