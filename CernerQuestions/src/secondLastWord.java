
public class secondLastWord {
	
	public static void main(String[] args) {
		
		String sentence = "I have got a nice,car";
		
		//The string split() method breaks a given string around
		//matches of the given regular expression.
		String[] word = sentence.split(",|\\ "); 
		
		//("\\W") this matches any non-word character  
		
		String secondLastWord = word[word.length-2];
		System.out.print(secondLastWord);
	}
}


