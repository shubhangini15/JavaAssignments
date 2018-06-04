import java.util.*;
public class FooBar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num%5 == 0 && num%7==0) {
			System.out.println("FooBar");
		} else if (num%7 == 0) {
			System.out.println("Bar");
		} else if (num%5==0 ) {
			System.out.println("Foo");
		}
	}

}
