package java111.week7;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


    

public class PhoneBookTest {

    /**
     * This method loads every line of the csv file into an ArrayList
     * @param path
     */
    public static void loadData(String path){
    try{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null){
        String[] lineArr = line.split(",");
        PhoneBook.addPhone(lineArr[0], lineArr[1], lineArr[2]);
    }
    } catch(FileNotFoundException fnf) {
        System.out.println("File not found");
        System.exit(0);
    }
    catch(IOException io) {
        System.out.println(io);
    }
    finally{
    }

}


    /**
     * This runs everything
     * @param args
     * @throws IOException
     */
	public static void main(String[] args) throws IOException{
        Scanner scnr = new Scanner(System.in);
		//Create a PhoneBook object instance

        //ResidentPhone r1 =  new ResidentPhone("Tina", "Cao", "8675309");
		//Get file name from user input 
        //read in data from the file
        System.out.println("Enter the name of the file you would like to open:");
        loadData(scnr.next());

        //print names and phone numbers from phone list of the PhoneBook object
        System.out.println("------------ Phone Book --------------------");
        PhoneBook.print();
		
        //prompt user to enter a person's name or the first few characters of a name

        System.out.println("Enter a search term to find a phone number:");

        //search phone book to find resident names and phone numbers
        String searchTerm = scnr.next();
        System.out.println("------------ \"" + searchTerm +"\" search results --------------------");
        PhoneBook.searchPhone(searchTerm).forEach((r)-> System.out.println(r.toString()));
        if (PhoneBook.searchPhone(searchTerm).size() == 0)
            System.out.println("No search results for " + "\"" + searchTerm +"\"." );
        
	}
   
}
