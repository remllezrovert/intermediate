package java111.week8;
import org.springframework.util.StopWatch;
/**
A question with choices and one correct answer.
*/
public class ChoiceQuestion extends Question
{
	private int numberOfChoices;

	   /**
	      Constructs a choice question with no choices.
	   */
	   public ChoiceQuestion()
	   {
	      super();
	      numberOfChoices = 0;
	   }

	   /**
	      Adds an answer choice to this question.
	      @param choice the choice to add
	      @param correct true if this is the correct choice, false otherwise
	   */
	   //Step-3: add java code to complete addChoice method
	   public void addChoice(String choice, boolean correct)
	   {
		  	numberOfChoices++; 
			if (correct)
				setAnswer(Integer.toString(numberOfChoices));
	      //update numberOfChoices
		   //call addText()method defined in Question class to create question choice
		   	addText(numberOfChoices + ") " + choice + "\n");
		   //if the choice is a correct answer, then set the choice as the answer
				



	   }
	   
	   public int getNumberChoice() {
		   return numberOfChoices;
	   }
	   
	   
}