package java111.week4;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Trevor Zellmer
 * This class holds information about the seat
 */
class Seat{
    int x;
    int y;
    int p;
    int[][] seatArr = TheatreSeat.seatArr;
    Seat(int x, int y, int p){
        this.x = x;
        this.y = y;
        this.p = p;
    }
int getX(){
    return x; 
}
int getY(){
    return y; 
}
int getPrice(){
    return p; 
}
}
public class TheatreSeat {
public static int[][] seatArr = {
{30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
{20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
{20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
{10, 10, 20, 20, 20, 20, 20, 20, 10, 10},  
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}
};
public static ArrayList<Seat> seatList = new ArrayList<Seat>();
/**
 * This method creates a seat object if the seat isn't allready taken
 * Then it adds the seat the the ArrayList<Seat>
 * @param x
 * @param y
 * @return Seat
 */
public static Seat sellSeat(int x, int y){
Seat s1 = new Seat(x, y, seatArr[x][y]);
if (seatArr[x][y] != 0){
    seatList.add(s1);
    seatArr[x][y] = 0;
    System.out.println("+$" + s1.getPrice());
    return s1;
} else {
    System.out.println("Seat Already Taken!");
    return null;
}
}

public static void main(String[] args){
Scanner scnr = new Scanner(System.in);
String input = "";
do{
    try{
    System.out.println("Input Row:");
    int x = scnr.nextInt() - 1;
    System.out.println("Input Column:");
    int y = scnr.nextInt() - 1;
    Seat s1 = sellSeat(x,y);
    System.out.println("Press q to exit or y to continue");
    if (scnr.next().toLowerCase().equals("q"))
    {
        System.out.println("Column Row  Price");
        //using a cool arraylist method with lambda expression here to get coordinates and price of seats
        seatList.forEach((i) -> System.out.printf("  %-4s  %-4s  %s\n",i.getX()+1, i.getY()+1, i.getPrice()));
        int sum = 0;
        for (int i = 0; i < seatList.size(); i++)
            sum += seatList.get(i).getPrice();
        System.out.println("\nYour total is: $" + sum);
        break; 
    }
    } catch(InputMismatchException ime) {
    System.out.println("Invalid Input");
    break;
    }
}while(!input.toLowerCase().equals("q"));
}
}