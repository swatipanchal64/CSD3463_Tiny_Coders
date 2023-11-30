public class Vehicle {

    // Properties
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    public Vehicle() {

    }
    // Constructor
    public Vehicle(String make, String plate, String color, VehicleType category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public VehicleType getCategory() {
        return category;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(VehicleType category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "\t - make: " + this.make +
                "\n\t - plate: " + this.plate +
                "\n\t - color: " + this.color +
                "\n\t - category: " + this.category;
    }
}
