package com.relationshipsinjava;

public class Camera { 
	
	public void click() { //Mobile and Camera has "Uses-A" relation, Mobile Uses-A Camera
		
	/* Create an object Mobile of class Mobile as an "Local Datamember" in class Camera.	
	 * In class Camera we have class Mobile object to access 
	 * properties and methods of class Mobile
	 */
	Mobile m1 = new Mobile(); 
	m1.clickPicture();
}
	public static void main(String[] args) {
		Camera c1 = new Camera();
		c1.click();
	}
}
