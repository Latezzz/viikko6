package main;

public class Vehicle {
    protected String type;
    protected String manufacturer;
    protected String model;
    protected int maxSpeed;
    protected Engine engine = null;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void printStats() {
        System.out.println(type + ": " + manufacturer + " " +model);
        engine.printStats();
        System.out.println("Huippunopeus: " + maxSpeed + "km/h");
        System.out.println("");
    }


        

}
