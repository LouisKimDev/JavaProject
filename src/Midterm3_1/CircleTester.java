package Midterm3_1;

public class CircleTester {
    public static void main(String[] args){
        Circle one = new Circle();
        one.setRadius(2);
        System.out.print("Radius: "+one.getRadius()+"\nArea: "+one.getArea()+"\nCircumference: "
                +one.getCircumference()+"\n"+one.toString());
    }
}
