package java111.week12;
import java.util.Arrays;
public class Tester  {
 public static void main(String[] args)
 {
 Address[] addresses = 
 {
 new Address("Main Street", 123),
 new Address("Main Street", 57),
 new Address("Hollywood Ave", 11235),
new Address("Guantonimo bay, Cuba", 666),
new Address("PeePee Point, Michigan",69)



 //step-3: add two more new Address objects, and then test the compareTo() method
 };
 //Step-4: bonus points: reproduce the following statements by using nested for loop
 //to compare all addresses in the Address array.
 System.out.println(addresses[0].compareTo(addresses[0]));
 System.out.println("Expected: 0");
 System.out.println(addresses[0].compareTo(addresses[1]) > 0);
 System.out.println("Expected: true");
 System.out.println(addresses[1].compareTo(addresses[2]) > 0);
 System.out.println("Expected: true");
 System.out.println(addresses[2].compareTo(addresses[1]) > 0);
 System.out.println("Expected: false");

 //System.out.println(Arrays.toString(addresses));
Arrays.sort(addresses);
 System.out.println(Arrays.toString(addresses));
 System.out.println(
 "Expected: [11235 Hollywood Ave, 57 Main Street, 123 Main Street]");





 }


}
