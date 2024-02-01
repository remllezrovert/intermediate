package java111.week2;

/**
 * @author Trevor Zellmer
 * This class tests the phone number formatting class p2
 */
public class TestP2 {
    public static void main(String[] args){
        System.out.println((p2.phoneNumber("2048675309").equals("(204)867-5309")) ? "Test 1 Passed" : "Test Failed");
        System.out.println((p2.phoneNumber("2048(675)309").equals("(204)867-5309")) ? "Test 2 Passed" : "Test Failed");
        System.out.println((p2.phoneNumber("12048675309").equals("+1(204)867-5309")) ? "Test 3 Passed" : "Test Failed");
        System.out.println((p2.phoneNumber("122048675309").equals("+12(204)867-5309")) ? "Test 4 Passed" : "Test Failed");
        System.out.println((p2.phoneNumber("1232048675309").equals("+123(204)867-5309")) ? "Test 5 Passed" : "Test Failed");

    }
}
