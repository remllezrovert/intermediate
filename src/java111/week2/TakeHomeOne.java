package java111.week2;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * @author Trevor Zellmer
 *  This class is a simple question/answer exam
 */
public class TakeHomeOne {

public static void main(String[] args)
{
Scanner scnr = new Scanner(System.in);

String[] questions = {
"What is your name?",
"What is your favorite color?", 
"What is the airspeed velocity of an unladen swallow? (int or double)", 
"What is your credit card number? (int)", 
"What grade am I going to give you on this exam? (char)",
"Would you like a cookie? (True or False)" 
};

String[] answers = {
"sir lancelot of camelot",
"green",
"20.1",
"123456789",
"F",
"True"
};

String[] inputArr = new String[6];
Boolean[] gradeArr = new Boolean[6];

//Java is very type save. Instead of adding all of the questions and answers to arrays
// I have the questions graded individually so that they are the correct type
// Eventually I would like to learn how to safely keep primatives of diffrent types together

try{

    System.out.println(questions[0]);                           
    String input0 = scnr.nextLine();
    gradeArr[0] = (input0.toLowerCase().equals(answers[0]));
    inputArr[0] = input0.toString();


    System.out.println(questions[1]);                           
    String input1 = scnr.next();
    gradeArr[1] = (input1.toLowerCase().equals("green"));
    inputArr[1] = input1.toString();


    System.out.println(questions[2]);
    double input2 = scnr.nextDouble();
    if (input2 > 0) {
        gradeArr[2] = (input2 == 20.1);
        inputArr[2] = Double.toString(input2);
    } else {
    System.out.println("Input cannot be negative");
    System.exit(0);
    }

    System.out.println(questions[3]);
    int input3 = scnr.nextInt();
    if (input3 > 0){
        gradeArr[3] = (input3 == 123456789);
        inputArr[3] = Integer.toString(input3);
    } else {
    System.out.println("Input cannot be negative");
    System.exit(0);
    }

    System.out.println(questions[4]);
    char input4 = scnr.next().charAt(0);
    gradeArr[4]= (input4 == 'F');
    inputArr[4] = Character.toString(input4);

    System.out.println(questions[5]);                           
    Boolean input5 = scnr.nextBoolean();
    gradeArr[5] = input5;
    inputArr[5] = input5.toString();

    System.out.println("--------------------- Grades ------------------------------");
    for (int i = 0; i < questions.length; i++){
        System.out.println(questions[i] + "\n\tYour answer:  " + inputArr[i] + "\n\tGrade:  " + gradeArr[i].toString()+ "\n");
    }
    scnr.close();

} catch(InputMismatchException ime) {
    System.out.println("You typed in an invalid answer!");
    scnr.close();
}

    }
}
