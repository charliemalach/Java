package vehicleapp;

public class VehicleApp {
    public static void main(String[] args) 
    {
        //client code pt 1: vehicle 

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle(50, 2, "black");

        System.out.println("Vehicles:");

        System.out.println(v1.toString() + " " + v1.movement());
        System.out.println(v2.toString() + " " + v2.movement());

        v2.setColor("red");
        System.out.println(v2.toString() + " " + v2.movement());
        
        System.out.println("The speed of v1 is " + v1.getSpeed());

        System.out.println();

        // client code pt 2: car

        Car c1 = new Car();
        Vehicle c2 = new Car(45, 4, "grey", 4);

        System.out.println("Cars:");

        System.out.println(c1.toString() + " " + c1.movement());
        System.out.println(c2.toString() + " " + c2.movement());

        c2.setColor("silver");
        System.out.println(c2.toString() + " " + c2.movement());

        System.out.println("The speed of c1 is " + c1.getSpeed());

        System.out.println();

        //client code pt 3: sports car 

        Car s1 = new SportsCar();
        Vehicle s2 = new SportsCar(100, 4, "orange", 2, 10);

        System.out.println("SportsCars:");

        System.out.println(s1.toString() + " " + s1.movement());
        System.out.println(s2.toString() + " " + s2.movement());

        c2.setColor("purple");
        System.out.println(s2.toString() + " " + s2.movement());

        System.out.println("The speed of s1 is " + s1.getSpeed());
        
        System.out.println();

    }
}
