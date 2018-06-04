package com.lambda.comparision;

public class Employee {
	
	    private Integer id;
	    private String name;
	    private Integer age;
	     
	    public Employee(Integer id, String name, Integer age){
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }
	     
	    //Other getter and setter methods
		public String getFirstName() {
			return name;
		}

		public void setFirstName(String name) {
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		 @Override
		    public String toString() {
		        return "\n["+this.id+","+this.name+","+this.age+"]";
		    }
}
