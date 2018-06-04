
public class FinalKeywordDemo {

	public static void main(String[] args) {
		Circle t1 = new Circle();
		System.out.println("Area of Circle: "+t1.area());
		System.out.println("Circumference of Circle: " +t1.circumference());
		
		Circle.method1(); 
		Shape.method1();
		Shape.method2();
		Rectangle.rect();

	}

}
