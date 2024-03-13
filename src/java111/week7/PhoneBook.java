package java111.week7;
import java.util.ArrayList;

public class PhoneBook {
     //define a private field which is an ArrayList of ResidentPhone objects
     private static ArrayList<ResidentPhone> phoneArr = new ArrayList<ResidentPhone>();

     public static ArrayList<ResidentPhone> getPhoneArr(){
          return phoneArr;
     }
     //public method: addPhone
     public static void addPhone(String lastName, String firstName, String phone) {
          ResidentPhone r1 = new ResidentPhone(firstName, lastName, phone);
          phoneArr.add(r1);
     }
     
     //public method: searchPhone
     public static ArrayList<ResidentPhone> searchPhone(String key){
          ArrayList<ResidentPhone> retArr = new ArrayList<ResidentPhone>();
          for (ResidentPhone r1: phoneArr)
               if (r1.toString().toLowerCase().contains(key.toLowerCase())) {
                    retArr.add(r1);
               }
          return retArr;

     }
     
     
     //public method: print
     public static void print(){
        phoneArr.forEach((r)-> System.out.println(r.toString()));
     }
}
