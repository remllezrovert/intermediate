package java111.week12;

public class Rectangle extends Quadrilateral{

    private double length;
    private double width;

    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPermeter() {
        return 2 * (length + width);
    }


}