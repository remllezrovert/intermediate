package java111.week8;

/**
A question with a text and an answer.
*/
public class Question
{
	private String text;
	private String answer;

	/**
	   Constructs a question with empty question and answer.
	*/
	public Question() 
	{
	   text = "";
	   answer = "";
	}

	/**
	   Sets the question text.
	   @param questionText the text of this question
	*/
	public void setText(String questionText)   
	{
	   text = questionText;
	}
	
	/**
	 * get the question text
	 * @return String: the text of this question
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * get the question answer
	 * @return String: the answer of this question
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	   Sets the answer for this question.
	   @param correctResponse the answer
	*/
	public void setAnswer(String correctResponse)
	{
	   answer = correctResponse;
	}
	
	/**
	   Checks a given response for correctness.
	   @param response the response to check
	   @return true if the response was correct, false otherwise
	*/
	public boolean checkAnswer(String response)
	{
	   return response.equalsIgnoreCase(answer);
	}
	
	/**
	   Displays this question.
	*/
	public void display()
	{
	   System.out.println(text);
	}
	
	
	 /**
    Adds text to the question text.
    @param questionText the text of this question
 */
	 public void addText(String questionText)
	 {
	    text = text + questionText;
	 }
}
