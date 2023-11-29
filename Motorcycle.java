public class Motorcycle extends Vehicle{
    private boolean sideCar;

    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sideCar) {
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    public boolean sideCar() {
        return sideCar;
    }

    public void sideCar(boolean sideCar) {
        this.sideCar = sideCar;
    }
}
