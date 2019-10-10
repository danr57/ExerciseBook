package Main;

public class Car extends Vehicle {
    public String getVEHICLE_TYPE() {
        return VEHICLE_TYPE;
    }

    final String VEHICLE_TYPE = "Car";

    public Car(String b) {
        this.seats = 5;
        this.wheels = 4;
        this.brand = b;
        this.horn = "Beep beep";
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", wheels=" + wheels +
                ", brand='" + brand + '\'' +
                '}';
    }
}