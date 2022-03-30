package shapeapp;
public class Rectangle implements Shape 
{
    private double width;
    private double length;


    public Rectangle(double width, double length) 
    {
        this.width = width;
        this.length = length; 
    }

    public double calcArea()
    {
        return length * width; 
    }

    public double calcPerimeter()
    {
        return 2 * length + 2 * width;
    }

    public String description()
    {
        return "rectangle ";
    }

    public String toString()
    {
        return "This is a " + length + " by " + width + " " + description();
    }
}