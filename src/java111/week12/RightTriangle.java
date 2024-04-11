package java111.week12;

public class RightTriangle extends Polygon{
    private double base;
    private double height;
    private int numberOfSides = 3;
   
    public RightTriangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    @Override
    public double getPermeter() {
        return base + 
        height + 
        Math.sqrt(Math.pow(base,2) + Math.pow(height,2));
    }


}