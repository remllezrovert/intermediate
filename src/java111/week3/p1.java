package java111.week3;
import java.util.Scanner;

/** * @author Trevor Zellmer
 */

 /**
  * This validates credit card numbers
  */
public class p1 {


public static Boolean ccNumber(String cn){
int sum = 0;
for (int i = 0; i < cn.length(); i++){
    int digit = Character.getNumericValue(cn.charAt(i));
    sum += digit; 
    //use modulo to get every other number from the right
    if (i % 2 == 0){
        sum += digit;
        if (digit > 4)
            sum += 1;
    }
    }
    if (sum % 10 == 0)
        return true;
    else
        return false;
}
public static void main(String[] args){
Scanner scnr = new Scanner(System.in);
    while (true){
try{
    System.out.println("Type in a credit card number to format:");
    String input = scnr.nextLine();
    String cn = input.replaceAll("[^0-9]", "");
    if (ccNumber(cn))
        System.out.println("Valid card number:  " + String.format(
            "%s-%s-%s-%s", cn.substring(0,4), 
            cn.substring(4, 8), cn.substring(8, 12), 
            cn.substring(12,16)));
    else
        System.out.println("INVALID NUMBER");
} catch (Exception e) {
    System.out.println("Sorry, there was an error!");
}
}
}
    
}

