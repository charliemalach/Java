package shapeapp;

public class EquilateralTriangle extends IsoscelesTriangle{
    private double leg1;

    public EquilateralTriangle(double leg1)
    {
        super(leg1);
        this.leg1 = leg1;
    }

    public double calcArea()
    {
        return Math.sqrt(3)/4 * (leg1* leg1);
    }

    public double calcPerimeter()
    {
        return 3*leg1;
    }

    public String description()
    {
        return "equilateral triangle";
    }

    public String toString()
    {
        return "This is a " + description() + " with sides equal to " + leg1 + ".";
    }
}
