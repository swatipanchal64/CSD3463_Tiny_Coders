public class Motorcycle extends Vehicle{
    private boolean sideCar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sideCar) {
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    @Override
    public String toString() {
        return "Employee has a motorcycle\n" +super.toString() + "\n\t - " +(!this.sideCar ? "without" : "with" ) + " sidebar";
    }
}
