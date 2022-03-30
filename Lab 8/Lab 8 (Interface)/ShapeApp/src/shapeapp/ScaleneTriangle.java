package shapeapp;

public class ScaleneTriangle extends Triangle{
    private double base;
    private double height;
    private double leg3;

    public ScaleneTriangle(double base, double height, double leg3)
    {
        super(base, height, leg3);
        this.base = base;
        this.height = height;
        this.leg3 = leg3;
    }

    public double calcArea()
    {
        return (base*height) / 2;
    }

    public double calcPerimeter()
    {
        return base + height + leg3;
    }


    public String description()
    {
        return "scalene triangle";
    }

    public String toString()
    {
        return "This is a " + description() + " with a base of " + base + " and a height of " + height + ".";
    }
}

