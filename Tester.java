public class Tester extends Employee{
    
    private int nbBugs;

    public Tester(String name, int birthYear, double monthlySalary, int rate, int nbBugs) {
        super(name, birthYear, monthlySalary, rate);
        this.nbBugs = nbBugs;
    }
        public int nbBugs() {
            return nbBugs;
        }
    
        public void nbBugs(int nbBugs) {
            this.nbBugs = nbBugs;
        }
}
