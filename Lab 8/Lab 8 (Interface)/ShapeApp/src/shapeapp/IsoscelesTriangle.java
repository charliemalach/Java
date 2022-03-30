package shapeapp;

public class IsoscelesTriangle extends Triangle{
    private double leg1;

    public IsoscelesTriangle(double leg1)
    {
        super(leg1, leg1, leg1);
        this.leg1 = leg1;
    }

    public double calcArea()
    {
        return .5 * leg1 * leg1;
    }

    public double calcPerimeter()
    {
        return (2*leg1)+leg1;
    }

    public String description()
    {
        return "isosceles triangle";
    }

    public String toString()
    {
        return "This is a "  + description() + " with sides equal to " + leg1 + ".";
    }
}
