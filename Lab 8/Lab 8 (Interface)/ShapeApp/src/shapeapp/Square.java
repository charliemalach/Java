package shapeapp;
public class Square extends Rectangle 
{
    public Square(double side)
    {
        super(side, side);
    }

    public double calcArea()
    {
        return super.calcArea();
    }

    public double calcPerimeter()
    {
        return super.calcPerimeter();
    }

    public String desctiption()
    {
        return "square";
    }

    public String toString()
    {
        return super.toString();
    }
    
}
