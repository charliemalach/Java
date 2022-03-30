package shapeapp;

public class RightTriangle extends Triangle {
    private double leg1;
    private double leg2;

    public RightTriangle(double leg1, double leg2)
    {
        super(leg1, leg2, leg1);
        this.leg1 = leg1;
        this.leg2 = leg1;
        double hyp = Math.sqrt((leg1 * leg1) + (leg2 * leg2));
        this.hyp = hyp;
    }

    public double calcArea()
    {
        return (leg1 * leg2) / 2;
    }

    public double calcPerimeter()
    {
        return leg1 + leg2 + hyp;
    }

    public String description()
    {
        return "right triangle";
    }

    public String toString()
    {
        return "This is a " + description() + " with a base of " + leg1 + " and height of " + leg2 + ". It's hypotenuse is " + hyp ;
    }
}
