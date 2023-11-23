public class Programmer extends Employee {

    private int nbProjects;

    public Programmer(String name, int birthYear, double monthlySalary, int rate, int nbProjects) {
        super(name, birthYear, monthlySalary, rate);
        this.nbProjects = nbProjects;
    }
        public int nbProjects() {
            return nbProjects;
        }
    
        public void nbProjects(int nbProjects) {
            this.nbProjects = nbProjects;
        }  
        
        protected double calculateBonus() {
            return nbProjects * GAIN_FACTOR_PROJECTS;
        }
}
