package java111.week12;

public abstract class Quadrilateral extends Polygon{

    protected int numberOfSides = 4;
    @Override
    public int getNumberOfSides() {
        return numberOfSides;
    }
}