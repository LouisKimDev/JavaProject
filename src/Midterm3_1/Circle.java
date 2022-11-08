package Midterm3_1;

public class Circle {
    private double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double getArea(){
        double area = Math.pow(radius*Math.PI,2);
        return area;
    }
    public double getCircumference(){
        double circum = 2 * radius * Math.PI;
        return circum;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
