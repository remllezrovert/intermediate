package java111.week7;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class LicensePlatesSimulator {

static ArrayList<String> plates = new ArrayList<String>();
static String path = "src//java111//week7//license_plates.txt";
/**
 * This appends plate numbers onto the csv file
 * @param path
 * @param plateNum
 */
public static void writeCsv(String path, String plateNum){
	try{
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
		writer.append(plateNum);
		writer.close();
	}	
	catch(FileNotFoundException fnf){
		System.out.println("File not found!");
	}
	catch(IOException io){
		System.out.println("error");
	}
	finally{
	}
}


/**
 * This loads all of the data from the csv file into the ArrayList plates
 * @param path
 */
public static void loadData(String path){
    try{
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null){
		plates.add(line);
    }
    } catch(FileNotFoundException fnf) {
        System.out.println("File not found");
    }
    catch(IOException io) {
        System.out.println(io);
    }
    finally{
    }

	}






public static void main(String[] args) throws IOException{
	String path = "src//java111//week7//license_plates.txt";
	//step-1: create a Random object as a random number generator 
	Random rNumberGenerator = new Random();	
	ArrayList<String> plates = getRandomPlates(rNumberGenerator, 100);
	//this loads all the data from the csv file into the plates array
	loadData(path);
	//this adds another 50 plates to the array
	plates.addAll(getRandomPlates(rNumberGenerator, 50));
	plates.forEach((p) -> System.out.println(p));
	plates.forEach((p) -> writeCsv(path, p + "\n"));
	System.out.println("Data is saved to " + (new File(path)).getAbsolutePath()	);
	    
	}
	/**
	 * getRandomPlates: generate license plate numbers by using random number generator
	 * @param rGenerator
	 * @param numR
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> getRandomPlates(Random rGenerator, int numR){
		ArrayList<String> plates = new ArrayList<String>();
		String p1 = "", p2="";
	//Step-5: add a for loop to generate part-1 and part-2 of the license plates
		//call getRandom() method to get part-1 and part-2 string
		for (int i = 0; i < numR; i++){
			p1 = getRandom(rGenerator, 65, 90, 3);
			p2 = getRandom(rGenerator, 48, 57, 4);
			plates.add(p1 + "-" + p2);
		}
		return plates;
	}

	/**
	 * getRandom: generate a sequence of random integer numbers and convert them to characters 
	 * @param rGenerator
	 * @param min
	 * @param max
	 * @param numR
	 * @return String
	 */
	public static String getRandom(Random rGenerator, int min, int max, int numR) {
		char[] randomPart = new char[numR];
		for (int i=0; i<numR; i++) {
			randomPart[i] = (char)(rGenerator.nextInt(max-min+1)+min);
		}
		
		return new String(randomPart); 
	}
}
