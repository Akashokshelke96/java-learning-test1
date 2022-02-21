package ProjectTest1;

public class Circle {
    double radius;
    double diameter = 2* radius;
    double circumference = 2 * 3.14 * radius;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getCircumference() {
        return circumference;
    }
    public double getArea(double radius){
        return 3.14 * Math.pow(radius,radius);

    }
}
