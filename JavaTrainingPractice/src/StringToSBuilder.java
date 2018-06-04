
public class StringToSBuilder {

	public static void main(String[] args) {
		String s1 = "Java";
		StringBuilder sb = new StringBuilder(s1);
		
		sb.reverse();
		System.out.println(sb);
		
		String rev = new String(sb);
		System.out.println(rev);
		
	}

}
