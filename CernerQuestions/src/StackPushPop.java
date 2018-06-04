
/*
 * Implement a stack with a push method and alternating pop method.
 * LIFO Last In First Out
 * Declare size of Stack.
 * */

import java.util.*;

public class StackPushPop {
	
	 static void showPush(Stack<Integer> stack, int a) { 
		stack.push(a);
		System.out.println("push("+a+")");
		System.out.println("Stack: "+stack);
	}
	 static void showPop(Stack<Integer> stack) {
		 boolean isEmpty = true;
		 if(isEmpty) {
			stack.pop();
			System.out.println("Stack: "+stack);	
	}
	 }
	
	public static void main(String[] args) {
		Stack <Integer> stack = new Stack<Integer>();
		System.out.println("Stack:" +stack);
		showPush(stack, 10);
		showPush(stack,20);
		showPush(stack,90);
		showPush(stack,30);
		showPop(stack);
		showPop(stack);
		showPop(stack);
		showPop(stack);
		try {
	         showPop(stack);
	      } catch (EmptyStackException e) {
	         System.out.println("Is Empty Stack");
	      } 
	}
}

/* ?????*********When to use STATIC method************?????????
 * 
 * One rule-of-thumb: ask yourself "does it make sense to call this method, even if no Obj 
 * has been constructed yet?" If so, it should definitely be static.
So in a class Car you might have a method double convertMpgToKpl(double mpg) which would be static, 
because one might want to know what 35mpg converts to, even if nobody has ever built a Car. But void
 setMileage(double mpg) (which sets the efficiency of one particular Car) can't be 
static since it's inconceivable to call the method before any Car has been constructed.
(Btw, the converse isn't always true: you might sometimes have a method which involves two Car objects, 
and still want it to be static. E.g. Car theMoreEfficientOf( Car c1, Car c2 ). Although this could be 
converted to a non-static version, some would argue that since there isn't a "privileged" choice of which 
Car is more important, you shouldn't force a caller to choose one Car as the object you'll invoke the 
method on. This situation accounts for a fairly small fraction of all static methods, though.)
 * 
 * */

	 /* static void showpush(Stack stack1, int a) {
	      stack1.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + stack1);
	   } 
	   static void showpop(Stack stack1) {
	      Integer a = (Integer) stack1.pop();
	      System.out.println(a);
	      System.out.println("stack: " + stack1);
	   } 
	   public static void main(String args[]) {
	      Stack stack1 = new Stack();
	      System.out.println("stack: " + stack1);
	      showpush(stack1, 40);
	      showpush(stack1, 50);
	      showpush(stack1, 60);
	      showpop(stack1);
	      showpop(stack1);
	      showpop(stack1);
	      
	      try {
	         showpop(stack1);
	      } catch (EmptyStackException e) {
	         System.out.println("it Is Empty Stack");
	      } 
	   }*/
	
	
	
