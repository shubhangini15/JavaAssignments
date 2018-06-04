/*
 *1. You can initialize a final variable when it is declared.
 *This approach is the most common. A final variable is called 
 *blank final variable,if it is not initialized while declaration.
 * Below are the two ways to initialize a blank final variable.
 * 2. A blank final variable can be initialized inside 
 * instance-initializer block or inside constructor. 
 * If you have more than one constructor in your class then 
 * it must be initialized in all of them, otherwise compile time
 *  error will be thrown.
 *  3. A blank final static variable can be initialized inside
 *   static block.
 * */


public class Circle extends Shape { //Circle class inherits Shape class using extends  
	
    //a final variable direct initializes
	 final float PI = 3.14f;  //Constant
	
	//a blank final variable
	final float RADIUS;
	
	{ //instance initializer block for initializing RADIUS
		RADIUS = 10.0f;
	}
	
	public float circumference() {
		//PI = 3.04f; //re-assigning final variable will throw compile time error
		return 2 * PI * RADIUS;
	}
	
	public float area() {
		return PI * (RADIUS * RADIUS);
	}
	 public static void method1() {
		 System.out.println("Subclass method. Method1 is overridden in Subclass circle.");
	 }
	
	/*public static void method2() { //method2 can't be accessed in sub class because it is declared final 
		
	}
	*/
}
