package shapeapp;
public class ShapeApp {
    public static void main(String[] args)
    {
        //testing Rectangle client code 
        Rectangle r1 = new Rectangle(2, 4);

        System.out.print(r1.toString());
        System.out.print("with an area " + r1.calcArea());
        System.out.println(" and a perimeter " + r1.calcPerimeter());

        //testing Square client code 
        Square s1 = new Square(5);
        System.out.print(s1.toString());
        System.out.print("with an area " + s1.calcArea());
        System.out.println(" and a perimeter " + s1.calcPerimeter());

        //testing Triangle client code 

        //testing out RightTriangle client code 
        RightTriangle t1 = new RightTriangle(3, 5);
        System.out.print(t1.toString());
        System.out.print(" with an area " + t1.calcArea());
        System.out.println(" and a perimeter " + t1.calcPerimeter());

        //testing out Isosceles Triangle client code 
        IsoscelesTriangle it1 = new IsoscelesTriangle(4);
        System.out.print(it1.toString());
        System.out.print(" This triangle has an area " + it1.calcArea());
        System.out.println(" and a perimeter " + it1.calcPerimeter());

        //testing out Equilateral Triangle client code 
        EquilateralTriangle et1 = new EquilateralTriangle(5);
        System.out.print(et1.toString());
        System.out.print(" This triangle has an area " + et1.calcArea());
        System.out.println(" and a perimeter " + et1.calcPerimeter());

        //testing out Scalene Triangle client code 
        ScaleneTriangle st1 = new ScaleneTriangle(5, 6, 7);
        System.out.print(st1.toString());
        System.out.print(" This triangle has an area " + st1.calcArea());
        System.out.println(" and a perimeter " + st1.calcPerimeter());
    }
}
