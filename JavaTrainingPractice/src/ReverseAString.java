
public class ReverseAString {
	
	static String str = "Hello java is very cool";
	 
	public  static String  reverseString(String str) {
		String newStr = "";
		char [] c = str.toCharArray();
		int len = c.length;
		for(int j = len-1; j >= 0; j--) {
			newStr += c[j];		 
	}
		return newStr;
	}

	public static void main(String[] args) {
		
		String str1 = "";
		
		String[] arr = str.split(" ");
				
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				str1 = str1 + arr[i] + " ";
			} else { 
				str1 = str1 + reverseString(arr[i]) + " ";	
				}
			}
		System.out.print(str1);
		}
	}
		
	



