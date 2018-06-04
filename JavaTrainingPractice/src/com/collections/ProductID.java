package com.collections;

public class ProductID  {
	
	int pId;
	
	ProductID(int pId){
		super(); 
		this.pId = pId;
	}
	
	//used to print productID details in main()
	public String toString() {
		return (this.pId+" ");
	}
	
	

	/*@Override
	public int compareTo(ProductID arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
