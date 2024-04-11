package java111.week12;
import java.util.Arrays;
import java.util.Collections;
public class ShapeTestDrive {
   
    public static void main(String[] args){
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(7.0, 9.0);
    Square square = new Square(10.0);
    RightTriangle rightTriangle = new RightTriangle(2.0,8.0);
    Rectangle rectangle2 = new Rectangle(10.0,10.0);
    Shape[] shapes = {
    circle,
    rectangle,
    square,
    rightTriangle,
    rectangle2
    };
    System.out.println("\nAll shapes:");
    for (Shape shape: shapes)
        System.out.println(shape.toString());


    Shape.setSortMode(1);
    Arrays.sort(shapes);

    System.out.println("\nShapes by area:");
    for (Shape shape: shapes)
        System.out.println(shape.toString());

    Shape.setSortMode(2);
    Arrays.sort(shapes, Collections.reverseOrder());
    System.out.println("\nTop 5 shapes by permimeter:");
    for (int i = 0; i < 5; i++)
        System.out.println((i + 1) + ". " + shapes[i].toString());
    
    //

    }
}
