package java111.week12;

public class Circle extends Shape{
   
    private double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPermeter() {
        return Math.PI * 2 * radius;
    }
}
