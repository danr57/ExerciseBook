package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
    public int getVehicleCount() {
        return vehicleCount;
    }

    private int vehicleCount = 0;

    private List<Vehicle> vehicles= new ArrayList<>();

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean addVehicle(Vehicle vehicle) {
        vehicleCount++;
        return this.vehicles.add(vehicle);
    }

    public boolean removeVehicle(Vehicle vehicle) {
        vehicleCount--;
        return this.vehicles.remove(vehicle);
    }

    public void fixVehicle(Vehicle vehicle) {
        System.out.println("The bill for fixing this vehicle is: £" + (vehicle.wheels *
                        vehicle.seats + vehicle.brand.length() * vehicle.horn.length()));
    }

    public void printAll() {
        for (Vehicle v : this.vehicles) {
            System.out.println(v);
        }
    }
}

