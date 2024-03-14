package java111.week8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTestDemo {

	public static void main(String[] args) {
		
		// Create a quiz an ArrayList named "quiz" that contains all kinds of questions
		ArrayList<Question> quiz = createQuiz();
	    // display quiz
        displayQuiz(quiz);
	}
	
	/**
	 * create a quiz that is an ArrayList of all kinds of questions
	 * @return an ArrayList of questions as a quiz
	 */
	//step-4: add java code to complete this method
	public static ArrayList<Question> createQuiz(){
		ArrayList<Question> quiz = new ArrayList<Question>();
		
		//create a new FillInQuestion question and add it to quiz
		FillInQuestion f1 = new FillInQuestion("what is the answer?", "yes");
		quiz.add(f1);
		//create a new ChoiceQuestion question and add it to quiz
		//create a new MultiChoiceQuestion question and add it to quiz
		MultiChoiceQuestion f2 = new MultiChoiceQuestion();
		f2.addChoice("blue", true);
		f2.addChoice("red", true);
		f2.addChoice("yellow", false);
		quiz.add(f2);

		//create a new NumericQuestion question and add it to quiz
		NumericQuestion f3 = new NumericQuestion("What is your favourite number?", 2.0);
		quiz.add(f3);

		//create a new FreeResponse question and add it to quiz
		FreeResponse f4 = new FreeResponse("How do I who?");
		quiz.add(f4);

		ChoiceQuestion f5 = new ChoiceQuestion();
		f5.addChoice("Pass", false);
		f5.addChoice("Fail", false);
		f5.addChoice("leave", true);
		quiz.add(f5);
	    return quiz;
	}
	
	/**
	 * display quiz questions and ask user to answer those questions
	 * @param quiz
	 */
	//step-5: add java code to complete this method
	public static void displayQuiz(ArrayList<Question> quiz) {
		Scanner input = new Scanner(System.in);
		//add a loop here to display each question in the quiz

		quiz.forEach((q) -> 
		{

			System.out.println("------- " + q.getClass().getSimpleName() + " ------");
			q.display();
			String uInput = input.nextLine().strip();
			boolean result = q.checkAnswer(uInput);
			System.out.println((result == true)? "correct": "incorrect");
		}
		);
		//get user answer from keyboard input
		//check user answer and display result (i.e., true or false, means answer is correct or not)
	}

}
