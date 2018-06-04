
public class StringBuilderEx {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.length());// here length is 4 
		System.out.println(sb.capacity()); //default SB size is 16---> 16+4 = 20
		System.out.println(sb.append("Program"));
		
		sb.trimToSize(); // trims extra space 
		System.out.println(sb.capacity());
				
	}

}
