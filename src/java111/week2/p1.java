package java111.week2;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Trevor Zellmer
 */
public class p1{

    /**
     * This methods calculates which date easter occurs on
     * @param year
     * @return dateString
     */
public static String findEaster(int y){
    int a = y %19;
    int b = y / 100;
    int c = y%100;
    int d = b / 4;
    int e = b % 4;
    //f does not exist in the instructions
    int g = (8 * b + 13) / 25;
    int h = (19 * a + b - d - g + 15) % 30;
    // I does not exist in the instructions
    int j = c / 4;
    int k = c % 4;
    int m = (a + 11 * h) / 319;
    int r = (2 * e + 2 * j - k - h + m + 32) % 7;
    int n = (h - m + r + 90) / 25;
    int p = (h - m + r + n + 19) % 32;
    return n + "/" + p + "/" + y;
}

public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a year:");
    try{
    System.out.println("That year, easter occured on:\t" + findEaster(scnr.nextInt()));
    } catch(InputMismatchException ime){
        System.out.println("Invalid input");
    }
    scnr.close();

}
}