package Main;

public abstract class Vehicle {
    protected int seats;
    protected int wheels;
    protected String brand;
    protected String horn;

    public Vehicle() {
        super();
    }

    public void honk() {
        System.out.println(horn);
    }

}
