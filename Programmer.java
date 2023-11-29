public class Programmer extends Employee {
    private static final int  DEFAULT_RATE = 100;

    private int nbProjects;

    private Motorcycle motorcycle;
    private Car car;

    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        this(name, birthYear, nbProjects, rate, (Motorcycle) null);
    }

    public Programmer(String name, int birthYear, int nbProjects) {
       this(name, birthYear, DEFAULT_RATE, nbProjects);
    }

    public Programmer(String name, int birthYear, int nbProjects, Motorcycle motorcycle) {
        this(name, birthYear, nbProjects, DEFAULT_RATE, motorcycle);
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Motorcycle motorcycle) {
        super(name, birthYear, rate, EmployeeType.Programmer);
        this.nbProjects = nbProjects;
        this.motorcycle = motorcycle;
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Car car) {
        super(name, birthYear, rate, EmployeeType.Programmer);
        this.nbProjects = nbProjects;
        this.car = car;
    }

    public Programmer(String name, int birthYear, int nbProjects, Car car) {
        this(name, birthYear, nbProjects, DEFAULT_RATE, car);
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

//    @Override
//    public String toString() {
//        return "Name: " + this.getName() + ", a Programmer \nAge: " + this.getAge() +
//                "\nEmployee has a car \n" + this.car + "\n" +
//                this.getName() + " has an occupation rate: "+ this.getRate() + "% He/She travelled " + this.getNbTravelDays() + " days and\n" +
//                "has bought " + this.getNbClients() + " new clients.\n" +
//                "His/Her estimated annual income is " + this.annualIncome();
//    }
}
