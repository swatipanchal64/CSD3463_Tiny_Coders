public class Programmer extends Employee {

    private int nbProjects;

    private Motorcycle motorcycle;

        public Programmer(String name, int birthYear, int nbProjects, int rate) {
            super(name, birthYear, rate);
            this.nbProjects = nbProjects;
//            this.motorcycle = motorcycle;
            printConstructorMessage();
        }

        public Programmer(String name, int birthYear, int nbProjects) {
            super(name, birthYear);
            this.nbProjects = nbProjects;
//            this.motorcycle = motorcycle;
            printConstructorMessage();
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

        public void printConstructorMessage() {
            System.out.println("We have a new employee: "+ this.getName()+", a programmer.");
        }
}
