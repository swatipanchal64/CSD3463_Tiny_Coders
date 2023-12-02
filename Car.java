public class Car extends Vehicle{
    
    private Gear gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type)
    {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    public Gear getGear() {
        return gear;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee has a car\n" +super.toString() +
               "\n\t - gear type: " + this.getGear() +
               "\n\t - type: " + this.getType();
    }
}
