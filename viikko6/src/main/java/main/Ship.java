package main;

public class Ship extends Vehicle{
    
    public Ship(String manufacturer, String model, int maxSpeed) {
        super("laiva", manufacturer, model, maxSpeed);
        engine = new Engine("Wärtsilä super", 1000);
    }



    public void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }


}
