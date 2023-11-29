import java.time.Year;

public abstract class Employee extends Vehicle {

    private String name;
    private int birthYear;
    private int age;
    private double monthlySalary;
    private int rate;

    private Vehicle vehicle;

    private EmployeeType type;

    private static final int  DEFAULT_RATE = 100;

    //Constants for Bonus 
    public static final double GAIN_FACTOR_CLIENT = 500;
    public static final double GAIN_FACTOR_TRAVEL = 100;
    public static final double GAIN_FACTOR_ERROR = 10;
    public static final double GAIN_FACTOR_PROJECTS = 200;

    public Employee(String name, int birthYear, int rate,  EmployeeType type){
        this(name, birthYear, rate, type, null);
    }

    public Employee(String name, int birthYear, EmployeeType type){
        this(name, birthYear, DEFAULT_RATE, type, null);
    }

    public Employee(String name, int birthYear, EmployeeType type, Vehicle vehicle) {
        this(name, birthYear, DEFAULT_RATE, type, vehicle);
    }

    public Employee(String name, int birthYear,  int rate, EmployeeType type, Vehicle vehicle) {
        super();
        this.name = name;
        this.birthYear = birthYear;
        this.age =  Year.now().getValue() - birthYear;
        this.rate = rate;
        this.type = type;
        this.vehicle = vehicle;

        System.out.println("We have a new employee: "+ this.name +", a "+this.type+".");

    }

    public String getName() {
        return name;
    }


    //Abstract class defination
    protected abstract double calculateBonus();

    public double annualIncome() {
        double baseYearlyIncome = 12 * monthlySalary * rate;
        return baseYearlyIncome + calculateBonus();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", a "+this.type+" \nAge: " + this.age;
    }
}

