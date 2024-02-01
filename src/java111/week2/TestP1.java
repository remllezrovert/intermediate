package java111.week2;
/**
 * @author Trevor Zellmer
 * This is a testing class for p1
 */
public class TestP1{
public static void main(String[] args){
    System.out.println("Test1: ");
    System.out.println(p1.findEaster(2017).equals("4/16/2017") ? "Test Passed" : "TestFailed");
    System.out.println("Test2: ");
    System.out.println(p1.findEaster(1902).equals("3/30/1902") ? "Test Passed" : "TestFailed");
}
}