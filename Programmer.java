public class Programmer extends Employee {
    private static final int  DEFAULT_RATE = 100;

    private int nbProjects;

    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        this(name, birthYear, nbProjects, rate, null);
    }

    public Programmer(String name, int birthYear, int nbProjects) {
       this(name, birthYear, DEFAULT_RATE, nbProjects);
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        this(name, birthYear, nbProjects, DEFAULT_RATE, vehicle);
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, EmployeeType.Programmer, vehicle);
        this.nbProjects = nbProjects;
    }

    protected double calculateBonus() {
        return nbProjects * GAIN_FACTOR_PROJECTS;
    }

    @Override
    public String toString() {
        return super.toString() + " and completed "+ this.nbProjects + " projects." +
                "\n His/Her estimated annual income is "+ this.annualIncome();
    }
}
