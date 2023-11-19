import java.time.Year;

public class Employee {

    private String name;
    private int birthYear;
    private int age;
    private double monthlySalary;
    private int rate;

    public Employee(String name, int birthYear, double monthlySalary, int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.age =  Year.now().getValue() - birthYear;
        this.monthlySalary = monthlySalary;
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
}
