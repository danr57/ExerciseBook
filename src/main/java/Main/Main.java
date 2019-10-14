package Main;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//
//        Results student1 = new Results(120, 150, 10);
//        Results student2 = new Results(150, 150, 150);
//
//        Problems problems = new Problems();
//
//        Tax person1 = new Tax(7000);
//        Tax person2 = new Tax(17000);
//        Tax person3 = new Tax(27000);
//        Tax person4 = new Tax(37000);
//        Tax person5 = new Tax(47000);
//
        new PrimeNumbers(100, 200);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 102, 100);
        nums = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(nums);
        System.out.println("Done");
//
////        Iteration iteration = new Iteration();
//
//        PersonManager manager = new PersonManager();
//        manager.addPerson(new Person("Abbie", 32, "Wizard"));
//        manager.addPerson(new Person("Bob", 25, "Bank Teller"));
//        manager.addPerson(new Person("Charlie", 12, "Binman"));
//        manager.addPerson(new Person("Dave", 54, "Fire fighter"));
//        manager.addPerson(new Person("Elizabeth", 63, "Teacher"));
//        manager.printAll();
//
//        Garage garage = new Garage();
//        garage.addVehicle(new Car("Ford"));
//        garage.addVehicle(new Motorcycle("Triumph", true));
//        garage.addVehicle(new Truck("Dodge", true));
//        garage.addVehicle(new Truck("Mitzubishi", false));
//        garage.addVehicle(new Motorcycle("Suzuki", false));
//        garage.printAll();
//
//        List<Vehicle> vehicles = garage.getVehicles();
//        garage.fixVehicle(new Truck("Big Truck", false));
//
//        new Truck("Truck", true).honk();
//        new Car("Car").honk();
//        new Motorcycle("Bike", false).honk();
//
//        for (Vehicle v : vehicles) {
//            garage.fixVehicle(v);
//        }
//        System.out.println("There are " + garage.getVehicleCount() + " vehicles in this garage.");
//        PaintWizard wiz = new PaintWizard();
//        wiz.addPaint(new Paint("Duluxe", 2, 44, 19.99));
//        wiz.addPaint(new Paint("Duluxe Plus", 2, 90, 29.99));
//        wiz.addPaint(new Paint("ASDA price", 2, 25, 5));
//        wiz.addPaint(new Paint("GudPaint", 3, 50, 25));
//        wiz.calculateCoverage();
//        wiz.sortPaints();
//        System.out.println(wiz.findCheapestForRoom(100));
    }
}
