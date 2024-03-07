// GradeBook3Test.java
// GradeBook3Test creates a GradeBook3 object and use an ArrayList object to store grades,
// 
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class GradeBook3Test {
   public static void main(String[] args) throws IOException {
         
      String[] fileNames = {"cs162grades.txt", "cs174grades.txt", "cs220grades.txt"};
      
      final int numBooks = fileNames.length;
      GradeBook3[]  gradeBooks = new GradeBook3[numBooks]; //declare an array reference variable for three GradeBook objects
      
      Scanner fileScanner = null; 
      File dataFile = null;
      //read in grades from text files and store grades into different GradeBook3 objects
      for (int i=0; i<numBooks; i++)
      {
    	  dataFile = new File(fileNames[i]); //set up a file object to open a file
    	  fileScanner = new Scanner(dataFile); //set up scanner object to read data from a specific file
   System.out.println(dataFile.getAbsolutePath());  //getPath()
      
          int count=0;
          // create an ArrayList to hold student grades from different data files
          ArrayList<Integer> gradesArray = new ArrayList<Integer>(30); //initial capacity is 10
          
          while(fileScanner.hasNext())
          {
        	  int grade = fileScanner.nextInt();
        	  gradesArray.add(grade);
        	  count++;    	  
          }
   System.out.println("There are " + count + " grades data in the file.\n");        
          String courseName = fileNames[i].substring(0,5);
          gradeBooks[i] = new GradeBook3(courseName, gradesArray);
         
      }
      
      fileScanner.close();

      for (int i=0; i<numBooks; i++) {
      
    	  System.out.printf("Welcome to the grade book for%n%s%n%n",
    	         gradeBooks[i].getCourseName()); //get course name

    	  gradeBooks[i].printReport(); //process grades
      }
      
      //call sortGrades method
      final boolean ASCENDING = true;
      final boolean DECENDING = false;
     
      ArrayList<Integer> ascGrades = gradeBooks[0].sortGrades(ASCENDING);
      ArrayList<Integer> decGrades = gradeBooks[1].sortGrades(DECENDING);
      
      gradeBooks[0].outputGrades();  //print original grades
      System.out.println (ascGrades);  //print out sorted grades
      
      gradeBooks[1].outputGrades();  
      System.out.println (decGrades); 
      
      //call updateGrade method to create a loop to update grades until user enters q means quit.
      updateGrade(gradeBooks[0]); //update grades for first GradeBook3 object
      gradeBooks[0].outputGrades();
      
      //call addGrade and removeGrade method
      gradeBooks[0].addGrade(300);     // add a grade at the end of the grades
      gradeBooks[0].addGrade(1, 400);  //add a grade at the specified location, for example here, add 400 as the first grade
      gradeBooks[2].removeGrade(1); 	//remove a grade at the specified location
      
      gradeBooks[0].outputGrades(); 
      gradeBooks[2].outputGrades(); 

   } // end of main
  
   public static void updateGrade(GradeBook3 myGradeBook) {
	   //print student#index's grade and update its grade by asking user enters a new grade for that student
	      System.out.println("\nwhich grade you want to update? \nEnter the index (1, 2, 3, etc. or q to quit)?");
		  Scanner sc = new Scanner(System.in);
	      String input = sc.nextLine();
		  while (!input.equalsIgnoreCase("q")) 
	      { 
				int index = Integer.parseInt(input);
	            System.out.print( "Enter the updated grade for that student: ");
	            
	            String newGrade = sc.nextLine();
	            myGradeBook.setGradeAt(index, Integer.parseInt(newGrade));
	      
	            System.out.printf("Update student %d's grade to: %3d%n", index, myGradeBook.getGradeAt(index));
	            System.out.println("which grade you want to update? Enter the index (1, 2, 3, etc. or q to quit)?");
	            input = sc.nextLine();
	            
	      }
	   sc.close();
   }
} //end of GradeBookTest class

