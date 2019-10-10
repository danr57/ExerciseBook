package Main;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public String getVEHICLE_TYPE() {
        return VEHICLE_TYPE;
    }

    final String VEHICLE_TYPE = "Motorcycle";

    public Motorcycle(String b, boolean sidecar) {
        this.hasSideCar = sidecar;
        this.brand = b;
        if (hasSideCar) {
            this.seats = 2;
            this.wheels = 3;
        } else {
            this.seats = 1;
            this.wheels = 2;
        }
        this.horn = "beeeeeeep";
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSideCar=" + hasSideCar +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", brand='" + brand + '\'' +
                '}';
    }
}
