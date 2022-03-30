package vehicleapp;

public class VehicleApp {
    public static void main(String[] args) 
    {
        // //client code pt 1: vehicle 

        // Vehicle v1 = new Vehicle();
        // Vehicle v2 = new Vehicle(50, 2, "black");
        // System.out.println("Vehicles:");
        // System.out.println(v1.toString() + " " + v1.movement());
        // System.out.println(v2.toString() + " " + v2.movement());
        // v2.setColor("red");
        // System.out.println(v2.toString() + " " + v2.movement());
        // System.out.println("The speed of v1 is " + v1.getSpeed());
        // System.out.println();
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


        //client code pt 4: truck 

        Truck t1 = new Truck();
        Vehicle t2 = new Truck(55.5, 4, "red");

        System.out.println("Trucks: ");

        System.out.println(t1.toString() + " " + t1.movement());
        System.out.println(t2.toString() + " " + t2.movement());

        t2.setColor("gray");
        System.out.println(t2.toString() + " " + t2.movement());

        System.out.println("The speed of t1 is " + t1.getSpeed());

        System.out.println();

        //client code pt 5: SUV

        SUV suv1 = new SUV();
        Vehicle suv2 = new SUV(30.5, 4, "silver");

        System.out.println("SUVs: ");

        System.out.println(suv1.toString() + " " + suv1.movement());
        System.out.println(suv2.toString() + " " + suv2.movement());

        suv2.setColor("black");
        System.out.println(suv2.toString() + " " + suv2.movement());

        System.out.println("The speed of suv1 is " + suv1.getSpeed());

        System.out.println();


        Vehicle[] arr = new Vehicle[5];
        arr[0] = suv2;
        arr[1] = c1;
        arr[2] = s1;
        arr[3] = t1;
        arr[4] = t2;

        printString(arr);
        calcTires(arr);
    
    }

    public static void printString(Vehicle[] arr)
    {
        System.out.println("printString results: ");
        int i;
        for(i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i].toString());
        }
    }

    public static void calcTires(Vehicle[] arr)
    {
        System.out.println("Tire Calculator: ");
        int i;
        int tires = 0;
        for(i = 0; i < arr.length; i++)
        {
            tires += arr[i].getWheels();
        }
        System.out.println("Total wheels: " + tires);
    }
}
