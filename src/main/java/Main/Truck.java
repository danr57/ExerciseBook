package Main;

public class Truck extends Vehicle{
    private boolean isPickup;

    public String getVEHICLE_TYPE() {
        return VEHICLE_TYPE;
    }

    final String VEHICLE_TYPE = "Truck";

    public Truck(String b, boolean pickup) {
        isPickup = pickup;
        if (isPickup) {
            this.seats = 3;
        } else {
            this.seats = 5;
        }
        this.wheels = 4;
        this.brand = b;
        this.horn = "HOOOOOONK";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "isPickup=" + isPickup +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", brand='" + brand + '\'' +
                '}';
    }
}
