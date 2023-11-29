import java.time.Year;

public abstract class Employee {

    private String name;
    private int birthYear;
    private int age;
    private double monthlySalary;
    private int rate;

    //Constants for Bonus 
    public static final double GAIN_FACTOR_CLIENT = 500;
    public static final double GAIN_FACTOR_TRAVEL = 100;
    public static final double GAIN_FACTOR_ERROR = 10;
    public static final double GAIN_FACTOR_PROJECTS = 200;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.age =  Year.now().getValue() - birthYear;
        this.rate = 100;
    }

    public Employee(String name, int birthYear,  int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.age =  Year.now().getValue() - birthYear;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    //Abstract class defination
    protected abstract double calculateBonus();

    public double annualIncome() {
        double baseYearlyIncome = 12 * monthlySalary * rate;
        return baseYearlyIncome + calculateBonus();
    }
}

