package java111.week12;
import java.util.Arrays;
public abstract class Shape implements Comparable<Shape>{

    private static int sortMode = 0;
    public abstract double getArea();
    public abstract double getPermeter();
    public String getName = this.getClass().getSimpleName();
    public String toString(){
    return this.getClass().getSimpleName() +
    " has an area of " +
    String.format("%.2f",this.getArea()) +
    "m^2 and a perimeter of " +
    String.format("%.2f", this.getPermeter()) +
    "m";
    }
    //use arrays.sort() and the Comparable<t> interface to sort this

public static void setSortMode(int sortMode) {
    Shape.sortMode = sortMode;
}
    public int compareTo(Shape s){
        return switch(sortMode){
            case 1 -> Double.compare(this.getArea(), s.getArea());
            case 2 -> Double.compare(this.getPermeter(), s.getPermeter());
            default -> 0;

        };
    }




    
}