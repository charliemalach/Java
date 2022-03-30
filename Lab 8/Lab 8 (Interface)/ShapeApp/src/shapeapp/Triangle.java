package shapeapp;
public abstract class Triangle implements Shape 
{

    private double leg1;
    private double leg2;

    public Triangle(double leg1, double leg2, double leg3)
    {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }
    
    public double hyp = (leg1 * leg1) + (leg2 * leg2);

    public double calcArea()
    {
        return (leg1 * leg2) / 2;
    }

    public double calcPerimeter()
    {
        return leg1 + leg2 + hyp;
    }

    public abstract String description();

    public abstract String toString();
}
