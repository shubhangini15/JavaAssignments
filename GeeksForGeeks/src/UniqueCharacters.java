import java.util.*;

public class UniqueCharacters {

	void repeatCharacters(String str){
		// If at any time we encounter 2 same
		// characters, return false

		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					System.out.println(str.charAt(i));
		
		break;
		}	
			
	}
	
	
	void uniqueCharacters(String s){
		for (int i=0; i<s.length(); i++)
			for (int j=i+1; j<s.length(); j++) {
				if (s.charAt(i) != s.charAt(j))
					System.out.println("-1");
			}		
	}

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();
		
		for (int t = 0; t < T; t++) {
			
		    UniqueCharacters obj = new UniqueCharacters();
			String UserStr = input.nextLine();

        //String result = obj.repeatCharacters(UserStr);
		obj.uniqueCharacters(UserStr);
	    obj.repeatCharacters(UserStr);
			
		
	}
}
}

