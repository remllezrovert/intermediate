package java111.week2;
import java.util.Scanner;

/**
 * @author Trevor Zellmer
 */

 /**
  * This class converts strings into phone numbers
  */
public class p2 {


public static String phoneNumber(String str){
    //This line removes letters and special characters if the user tried to add their own
String pn = str.replaceAll("[^0-9]", "");
    //This switch case handles different country codes for international calls
switch (pn.length()) {
case 10:
    return String.format("(%s)%s-%s", pn.substring(0, 3), pn.substring(3, 6), pn.substring(6, 10));
case 11: 
    return String.format("+%s(%s)%s-%s", pn.charAt(0), pn.substring(1, 4), pn.substring(4, 7), pn.substring(7,11));
case 12:
    return String.format("+%s(%s)%s-%s", pn.substring(0,2), pn.substring(2, 5), pn.substring(5, 8), pn.substring(8,12));
case 13:
    return String.format("+%s(%s)%s-%s", pn.substring(0,3), pn.substring(3, 6), pn.substring(6, 9), pn.substring(9,13));
default:
    return "Invalid phone number";
    }
}

public static void main(String[] args){
System.out.println("Type in a phone number to format:");
Scanner scnr = new Scanner(System.in);
try{
    System.out.println("Your formatted phone number is:\n\t"  + phoneNumber(scnr.next()));
} catch (Exception e) {
    System.out.println("Sorry, there was an error!");
    //System.out.println(e);
}
scnr.close();
}
    
}

