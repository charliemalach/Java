package vehicleapp;

public class Car extends Vehicle 
{ //inherits data from Vehicle
    
    private int doors; 

    public Car()
    {
        super.setType("car");
        doors = 4;
    }

    public Car(double speed, int wheels, String color, int doors)
    {
        super(speed, wheels, color);
        super.setType("car");
        this.doors = doors;
    }

    public String toString()
    {
        return super.toString() + " I have " + doors + " doors."; 
    }

    public String movement()
    {
        return "I cruise.";
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }
}

