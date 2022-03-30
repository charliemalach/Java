package vehicleapp;

public class Truck extends Vehicle {

    public Truck()
    {
        super.setType("truck");
    }

    public Truck(double speed, int wheels, String color)
    {
        super(speed, wheels, color);
        super.setType("Truck");
    } 

    public String movement()
    {
        return "I haul.";
    }
}

