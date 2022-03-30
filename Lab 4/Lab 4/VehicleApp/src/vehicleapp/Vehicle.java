package vehicleapp;
public class Vehicle 
{
    private double speed;
    private int wheels;
    private String type;
    private String color; 
    //default constructor 
    public Vehicle()
    {
        speed = 100;
        wheels = 4; 
        type = "vehicle";
        color = "white";
    }

    public Vehicle(double speed, int wheels, String color)
    {
        this.speed = speed;
        this.wheels = wheels;
        type = "vehicle";
        this.color = color;
    }
    //toString method 
    public String toString()
    {
        return "I am a " + color + " " + type + "with " + wheels + " wheels. My speed is " + speed + " miles per hour.";
    }
    //movement method 
    public String movement()
    {
        return "I move.";
    }


    //accessor methods 
    public double getSpeed()
    {
        return speed;
    }
    
    public int getWheels()
    {
        return wheels;
    }

    public String getType()
    {
        return type;
    }

    public String getColor() 
    {
        return color;
    }

//mutator methods 
    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public void setWheels(int wheels)
    {
        this.wheels = wheels;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
