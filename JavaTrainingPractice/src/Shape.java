/*
 * Super class*/

class Shape {

	public static void  method1(){
		System.out.println("Super class method. Method can be overridden");
	}
	
	final public static void method2() {
		System.out.println("Final at method level. Method can't be overridden");
	}
	
}
