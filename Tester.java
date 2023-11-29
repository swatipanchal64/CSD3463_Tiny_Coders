public class Tester extends Employee{
    
    private int nbBugs;

    public Tester(String name, int birthYear, int nbBugs, int rate) {
        super(name, birthYear, rate, EmployeeType.Tester);
        this.nbBugs = nbBugs;
    }

    public Tester(String name, int birthYear, int nbBugs) {
        super(name, birthYear, EmployeeType.Tester);
        this.nbBugs = nbBugs;
    }

    public int nbBugs() {
        return nbBugs;
    }

    public void nbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    protected double calculateBonus() {
            return nbBugs * GAIN_FACTOR_ERROR;
        }

    public void printConstructorMessage() {
        System.out.println("We have a new employee: "+ this.getName()+", a tester.");
    }
}
