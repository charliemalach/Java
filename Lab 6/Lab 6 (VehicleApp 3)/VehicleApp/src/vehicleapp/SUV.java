package vehicleapp;

public class SUV extends Truck {
    public SUV()
    {
        super.setType("SUV");
    }

    public SUV(double speed, int wheels, String color)
    {
        super(speed, wheels, color);
        super.setType("SUV");
    } 

    public String movement()
    {
        return "I steadily progress on the way home from soccer practice.";
    }

}
