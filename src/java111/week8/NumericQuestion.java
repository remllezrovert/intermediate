package java111.week8;
import java.math.*;

public class NumericQuestion extends Question
{
   private double expected;
   
   public NumericQuestion(String questionText, double correctResponse)
   {
      setText(questionText);
      setAnswer(correctResponse);
   }
   
   public void setAnswer(double correctResponse)
   {
      expected = correctResponse;
   }
   
   public void display()
   {
      super.display();
      System.out.println("Enter a number.");
   }
   
   //step-2: add java code to complete this method
   public boolean checkAnswer(String response)
   {
       //convert response to a double type value
       Double responseDouble = Double.parseDouble(response);
       //Double expectedDouble = Double.parseDouble(expected);
	   //and then compare the response with the expected answer

	   //If the response and the expected answer differ by no more than 0.01, 
	   //then accept the response as correct.
	   
      if ((responseDouble >= expected - 0.01) && (responseDouble <= expected + 0.01))
         return true;
      return false;
   }
   

   
}


