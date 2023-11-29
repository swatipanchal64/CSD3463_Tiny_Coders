public class Manager extends Employee {

    private float nbTravelDays;
    private int nbClients;

    private Car car;

    public Manager( String name, int birthYear, int nbClients, float nbTravelDays) {
        super(name, birthYear);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        printConstructorMessage();
    }

    public Manager( String name, int birthYear, int nbClients, float nbTravelDays, int rate) {
        super(name, birthYear, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
        printConstructorMessage();
    }

    public float getNbTravelDays() {
        return nbTravelDays;
    }

    public void setNbTravelDays(float nbTravelDays) {
        this.nbTravelDays = nbTravelDays;
    }

    public int getNbClients() {
        return nbClients;
    }

    public void setNbClients(int nbClients) {
        this.nbClients = nbClients;
    }

    protected double calculateBonus() {
        double clientBonus = nbClients * GAIN_FACTOR_CLIENT;
        double travelBonus = nbTravelDays * GAIN_FACTOR_TRAVEL;
        return clientBonus + travelBonus;
    }

    public void printConstructorMessage() {
        System.out.println("We have a new employee: "+ this.getName()+", a manager.");
    }
}
