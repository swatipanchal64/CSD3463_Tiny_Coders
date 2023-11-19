public class Manager extends Employee {

    private float nbTravelDays;
    private int nbClients;

    public Manager(String name, int birthYear, double monthlySalary, int rate, float nbTravelDays, int nbClients) {
        super(name, birthYear, monthlySalary, rate);
        this.nbTravelDays = nbTravelDays;
        this.nbClients = nbClients;
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
}
