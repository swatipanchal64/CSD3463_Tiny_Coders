public class Manager extends Employee {

    private static final int  DEFAULT_RATE = 100;

    private float nbTravelDays;
    private int nbClients;


    public Manager(String name, int birthYear, int nbClients, float nbTravelDays, int rate, Vehicle vehicle) {
        super(name, birthYear, rate, EmployeeType.Manager, vehicle);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
    }

    public Manager(String name, int birthYear, int nbClients, float nbTravelDays, Vehicle vehicle) {
        this(name, birthYear, nbClients, nbTravelDays, DEFAULT_RATE, vehicle);
    }

    public Manager(String name, int birthYear, int nbClients, float nbTravelDays, int rate) {
        this(name, birthYear, nbClients, nbTravelDays, rate, null);
    }

    public Manager(String name, int birthYear, int nbClients, float nbTravelDays) {
        this(name, birthYear, nbClients, nbTravelDays, DEFAULT_RATE, null);
    }

    public float getNbTravelDays() {
        return nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }

    protected double calculateBonus() {
        double clientBonus = nbClients * GAIN_FACTOR_CLIENT;
        double travelBonus = nbTravelDays * GAIN_FACTOR_TRAVEL;
        return clientBonus + travelBonus;
    }

    public void printConstructorMessage() {
        System.out.println("We have a new employee: "+ this.getName()+", a manager.");
    }

    @Override
    public String toString() {
        return super.toString() + " He/She travelled " + this.getNbTravelDays() + " days and\n" +
                "has bought " + this.getNbClients() + " new clients.\n" +
                "His/Her estimated annual income is " + this.annualIncome();
    }
}
