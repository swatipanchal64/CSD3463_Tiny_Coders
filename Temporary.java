public class Temporary extends Contract{
    private double hourlyWage;
    private int accumulatedHours;

    public Temporary(double hourlyWage, int accumulatedHours) {
        this.hourlyWage = hourlyWage;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double accumulatedSalary() {
        return accumulatedHours * hourlyWage;
    }

    @Override
    public double annualIncome() {
        return accumulatedSalary() * 12;
    }

    @Override
    public String toString() {
        return "He is a temporary employee with "+this.hourlyWage+" hourly salary and he has worked for "+this.accumulatedHours+" hours.";
    }

    @Override
    public void convertFrom(double accumulatedSalary) {
        this.accumulatedHours = (int) (accumulatedSalary / hourlyWage);
    }
}
