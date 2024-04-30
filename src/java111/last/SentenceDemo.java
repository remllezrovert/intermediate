
import java.lang.StringBuilder;
/**
   A tester class for Sentence.
*/
public class SentenceDemo

{
   public static void main(String[] args)
   {
      Sentence s = new Sentence("Mississippi!");
      boolean b = s.find("sip");
      System.out.println(b);
      System.out.println("Expected: true");
      b = s.find("tip");
      System.out.println(b);
      System.out.println("Expected: false");
	  
	  //add two more testing cases 
	  //(one case return true, another case return false)
      b = s.find("pi");
      System.out.println(b);
      System.out.println("Expected: true");
      b = s.find("hello");
      System.out.println(b);
      System.out.println("Expected: false");
	  

   }
     
   
}

/**
 Define class Sentense
*/
class Sentence
{
   private String phrase = "Mississippi!";

   /**
      Constructs a Sentence object.
      @param aPhrase a phrase entered by user
   */
   public Sentence(String aPhrase)
   {
      phrase = aPhrase;
   }
   
   /**
      Determines if a string exists in the phrase.
      @param text the string to find
      @return true if the string is found, false otherwise
   */

   public boolean find(String text)
   {
      if (phrase.startsWith(text)) //get substring with the same length as 'text'
      {
         return true;
      } 
      else if (text.length() >= phrase.length() || phrase.length() <= 0)
      {
         return false;
      }
      else 
      {
         StringBuilder sb = new StringBuilder(phrase);
         sb.deleteCharAt(0);
         sb.toString();
      return new Sentence(sb.toString()).find(text);
   } 
	   
   }
}
