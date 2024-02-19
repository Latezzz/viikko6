package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot, 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String input = sc.nextLine();
                i = Integer.parseInt(input);

                switch (i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        input = sc.nextLine();
                        int j = Integer.parseInt(input);

                        String manufacturer;
                        String model;
                        int maxSpeed;

                        
                        switch (j) {
                            case 1:
                                System.out.println("Anna kulkuneuvon valmistaja:");
                                manufacturer = sc.nextLine();
                                System.out.println("Anna kulkuneuvon malli:");
                                model = sc.nextLine();
                                System.out.println("Anna kulkuneuvon huippunopeus:");
                                maxSpeed = Integer.parseInt(sc.nextLine());

                                Car c = new Car(manufacturer, model, maxSpeed);

                                vehicles.add(c);
                                break;
                            
                            case 2:
                                System.out.println("Anna kulkuneuvon valmistaja:");
                                manufacturer = sc.nextLine();
                                System.out.println("Anna kulkuneuvon malli:");
                                model = sc.nextLine();
                                System.out.println("Anna kulkuneuvon huippunopeus:");
                                maxSpeed = Integer.parseInt(sc.nextLine());

                                Plane p = new Plane(manufacturer, model, maxSpeed);
                                vehicles.add(p);
                                break;

                            case 3:
                                System.out.println("Anna kulkuneuvon valmistaja:");
                                manufacturer = sc.nextLine();
                                System.out.println("Anna kulkuneuvon malli:");
                                model = sc.nextLine();
                                System.out.println("Anna kulkuneuvon huippunopeus:");
                                maxSpeed = Integer.parseInt(sc.nextLine());

                                Ship s = new Ship(manufacturer, model, maxSpeed);
                                vehicles.add(s);
                                break;

                            default:
                                break;
                        
                        }                      
                        break;

                    case 2:
                        for (Vehicle vehicle : vehicles) {
                            vehicle.printStats();
                        }
                        break;

                    case 3:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Car) {
                                ((Car)vehicle).drive();
                            }
                        }
                        break;

                    case 4:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Plane) {
                                ((Plane)vehicle).fly();
                            }
                        }
                        break;

                    case 5:
                        for (Vehicle vehicle : vehicles) {
                            if (vehicle instanceof Ship) {
                                ((Ship)vehicle).sail();
                            }
                        }
                        break;
                    
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        
        }
        sc.close();
    }
    
}
