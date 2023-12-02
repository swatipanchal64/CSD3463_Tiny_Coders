public class Tester extends Employee{
    
    private int nbBugs;
    private static final int  DEFAULT_RATE = 100;

    public Tester(String name, int birthYear, int nbBugs, int rate) {
        super(name, birthYear, rate, EmployeeType.Tester, null);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, EmployeeType.Tester, vehicle);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int nbBugs, Vehicle vehicle) {
        super(name, birthYear, DEFAULT_RATE, EmployeeType.Tester, vehicle);
        this.nbBugs = nbBugs;
    }

    protected double calculateBonus() {
            return nbBugs * GAIN_FACTOR_ERROR;
        }

    @Override
    public String toString() {
        return super.toString() + " and corrected "+this.nbBugs+" bugs.\n" +
                "His/Her estimated annual income is " + this.annualIncome();
    }

}
