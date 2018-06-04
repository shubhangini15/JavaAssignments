
public class ReverseWord {

	public static void main(String[] args) {
		String str = "do.if";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		for(int i = 0; i <= sb.length()-1; i++) {
			
		    char period = sb.charAt(i);
		    StringBuilder temp = new StringBuilder().append(period);
		    		
			if(period == '.') {
				temp.reverse();
				System.out.print(temp);
			}
			else if(period == ' '|| period == '\n'|| period == '\t') {
				break;
			}
			
		}
		System.out.println("");

	}

}
