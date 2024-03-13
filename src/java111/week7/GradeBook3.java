// GradeBook3.java
// GradeBook3 class using an ArrayList to store test grades.
import java.util.ArrayList;
import java.util.Collections;

public class GradeBook3 {
   private String courseName; // name of course this GradeBook represents
   private ArrayList<Integer> grades; // array of student grades by using ArrayList
   //define a map of student id with student grades 
   //create a GradeItem object,

   // constructor
   public GradeBook3(String courseName, ArrayList<Integer> grades) {
      this.courseName = courseName;
      this.grades = new ArrayList<Integer>(grades);
   }
   
   
   // method to retrieve the course name
   public String getCourseName() {
      return courseName;
   }


   //method to update individual grade
   public void setGradeAt(int glocation, int newGrade)//index starts from 1
   {
	   grades.set(glocation-1, newGrade); //set() method from ArrayList object
   }

   //method to retrieve individual grade
   public int getGradeAt(int glocation)//index starts from 1
   {
   	   return grades.get(glocation-1);  //get() method from ArrayList object
   }

   // perform various operations on the data
   public void printReport() {
      // output grades array
      outputGrades();

      // call method getAverage to calculate the average grade
      System.out.printf("%nClass average is %.2f%n", getAverage());

      // call methods getMinimum and getMaximum
      System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
         getMinimum(), getMaximum());

      // call outputBarChart to print grade distribution chart
      outputBarChart();
   }

   // find minimum grade
   public int getMinimum() {
      int lowGrade = grades.get(0); // use get() method defined in ArrayList class

      // loop through grades array
      for (int grade : grades) {
         // if grade lower than lowGrade, assign it to lowGrade
         if (grade < lowGrade) {
            lowGrade = grade; // new lowest grade
         }
      }

      return lowGrade;
   }

   // find maximum grade
   public int getMaximum() {
      int highGrade = grades.get(0); // se get() method defined in ArrayList class

      // loop through grades array
      for (int grade : grades) {
         // if grade greater than highGrade, assign it to highGrade
         if (grade > highGrade) {
            highGrade = grade; // new highest grade
         }
      }

      return highGrade;
   }

   // determine average grade for test
   public double getAverage() {
      int total = 0;

      // sum grades for one student
      for (int grade : grades) {
         total += grade;
      }

      // return average of grades
      return (double) total / grades.size(); //size() method defined in ArrayList class
   }

   // output bar chart displaying grade distribution
   public void outputBarChart() {
      System.out.println("Grade distribution:");

      // stores frequency of grades in each range of 10 grades
      int[] frequency = new int[11]; //counters for 0,1, 2, 3,..., 10

      // for each grade, increment the appropriate frequency
      for (int grade : grades) {
         ++frequency[grade / 10];
      }

      // for each grade frequency, print bar in chart
      for (int count = 0; count < frequency.length; count++) {
         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
         if (count == 10) {
            System.out.printf("%5d: ", 100);
         }
         else {
            System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
         }

         // print bar of asterisks
         for (int stars = 0; stars < frequency[count]; stars++) {
            System.out.print("*");
         }

         System.out.println();
      }
   }

   // output the contents of the grades array
   public void outputGrades() {
      System.out.printf("%nThe grades are:%n");

      // output each student's grade
      for (int student = 0; student < grades.size(); student++) {
         System.out.printf("Student %2d: %3d%n",
            student + 1, grades.get(student)); //use get() method defined in ArrayList class
      }
   }
   
   public ArrayList<Integer> sortGrades(boolean ascending) {     //this sorting will make the original grades to be sorted       
	        
	   ArrayList<Integer> gradesCopy = (ArrayList<Integer>) grades.clone();  //create a copy of grades 
	   if (ascending)   
		   Collections.sort(gradesCopy);    //use sort() method from Collections class
	   else   
		   Collections.sort(gradesCopy, Collections.reverseOrder()); 
	   
	   return gradesCopy;     
	}       

   //addGrade method to add a new grade at the end of the grade list
   public void addGrade(Integer newgrade) {
		   grades.add(newgrade);  //use add() method from ArrayList object
	   
   }
   
 //addGrade method to add a new grade at a specific location, this is an overloading method
   public void addGrade(int location, Integer newgrade) {
	   if (location > 0)	   
	      grades.add(location-1, newgrade);  //use add() method from ArrayList object   
   }
  
   //removeGrade method
   public void removeGrade(int glocation) {
	  
	   if (glocation >= 1) 
		   grades.remove(glocation-1);  //use remove() method from ArrayList object
   
   }
   
}


