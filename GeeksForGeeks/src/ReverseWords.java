import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		try {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for (int i = 0; i <= T; i ++) {
			
			String wordInput = input.nextLine();
			
			//String array[] = new String[wordInput];
		    
			for(int j = 0; j < wordInput.length()-1; j++) {
				char character = wordInput.charAt(j);
				if(character == '.') {
					int endIndex = character;
					System.out.println(wordInput.substring(endIndex));
					
				}
			    System.out.println();
		    
		}
	
}}
		catch(Exception e) {
			
		}

}
}