package java111.week4;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.util.Random;
/**
 * @author Trevor Zellmer
 */

public class ESPGame{



static int[][] colors = new int[2][5];
static String[] colorName = {"red", "green", "blue", "yellow", "purple"};

/**
 * This creates the final grade report
 * @return
 */
static String gradeTest(){
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%-5s %-4s %-3s\n", "Color", "CPU", "User"));
    for (int i = 0; i< colors[0].length; i++){
    sb.append(String.format("%-10s %-4s %-3s\n", colorName[i], colors[0][i], colors[1][i]));
    }
    return sb.toString();
}
/**
 * This grades user input at each turn, and iterates cpu & user inputs in colors[][]
 * @param input
 * @param rando
 * @return
 */
static String gradeInput(String input, int rando){
int playerIndex; 
    switch(input.toLowerCase()){
    case "red":
    case "r":
        playerIndex = 0;
        break;
    case "green":
    case "g":
        playerIndex = 1;
        break;
    case "blue":
    case "b":
        playerIndex = 2;
        break;
    case "yellow":
    case "y":
        playerIndex = 3;
        break;
    case "purple":
    case "p":
        playerIndex = 4;
        break;
    case "q": return "Quitting!";
    default:                    //invalid inputs are simply treated as 'wrong'
    return "That's not a valid color!";
    }
    colors[0][rando]++;
    colors[1][playerIndex]++;
    if (playerIndex == rando)
        return colorName[playerIndex] + " is correct!";
    else return "You guessed " + colorName[playerIndex] + ". The correct answer was " + colorName[rando] + ".";
    

}
/**
 * This is the game loop, it promps the user for input until the type 'q' to quit
 * @param args
 */
public static void main(String[] args){
Random r = new Random();
String input = JOptionPane.showInputDialog("Enter a color (or q to exist):");
while (!input.toLowerCase().equals("q")){
    int rando = r.nextInt(5);
    //System.out.println(gradeInput(input, rando)? "Good" : "Wrong");
    System.out.println(gradeInput(input, rando));
    try{
    input = JOptionPane.showInputDialog("Enter a color (or q to exit):");
    } catch (InputMismatchException ime) {
        System.out.println("Invalid user input");
    }
 
}
JOptionPane.showMessageDialog(null, gradeTest(), "Grade", 1);

}
}