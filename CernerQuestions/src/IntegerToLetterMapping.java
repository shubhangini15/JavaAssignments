/*
 * Given a string separated by a space like "123456 abc+efg" 
 * determine the solution by mapping integers to letters like a:1, b:2, c:3, d:4, e:5, f:6. 
 * The only operations allowed were + or -. 
 * So the calculated solution that made the tests pass was 123+456 = 579. */
 import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class IntegerToLetterMapping {
	
	public static void main(String[] args) {
		String str = "12345 abc+de";
		String delim = "[+ -]";
		String[] token = str.split(delim);
		System.out.println(token);
		if(delim.equals("+")) {
			Pattern ptr = Pattern.compile("(\\d{1,3})\\+|-(\\d{1,3})");
			//Matcher mtc = ptr.matcher(token);
			//;
		}
		
		String subStr1 = str.substring(0, 4);
		String subStr2 = str.substring(6);
		String newOne = subStr1.replaceAll(subStr2, subStr1);
		System.out.println(newOne);
		
	}
}
