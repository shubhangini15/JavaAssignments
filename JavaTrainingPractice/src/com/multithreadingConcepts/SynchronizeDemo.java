package com.multithreadingConcepts;

class Call{
	public synchronized void call (String name) {
		for(int i=0; i<2; i++) {
			System.out.println("Hello " +name);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread3 implements Runnable {
	String name;
	Call c1;
	
	MyThread3(String name, Call c1){
		this.name = name;
		this.c1 = c1;
		
		//Convert Runnable obj into Thread obj
		
		Thread t = new Thread(this);
		t.start(); //call run() method

	}
	@Override
	public void run() {
		c1.call(name);
	}
}

public class SynchronizeDemo {

	public static void main(String[] args) {
		
		Call c1 = new Call();
		MyThread3 m1 = new MyThread3("Raja", c1);
		MyThread3 m2 = new MyThread3("Abhi", c1);
		/*MyThread3 m3 = new MyThread3("Mike", c1);
		MyThread3 m4 = new MyThread3("Scott", c1);*/
	}

}
