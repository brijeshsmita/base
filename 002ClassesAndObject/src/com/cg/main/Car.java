package com.cg.main;
public class Car {
	int id;
	String name;
	//method Overriding-same method name,
	//same parameters,same return type
	//always used in inheritance(subclass)
	/*public String toString(){
		return "\nCar Id is :"+id
				+"\nCar Name is :"+name;
	}*/
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Class of c1 object is : "+c1.getClass());
		System.out.println(c1.toString());
		//whenever we try to print the object 
		//calback is given to toString() method
		//if we have not overridden toString then Object class
		//toString() is invoked
		//Object class toString() returns String which 
		// has fully qualified class name , @, unique hashCode
		System.out.println("HashCode c1: "+c1.hashCode());
		Car c2 = new Car();
		System.out.println("HashCode c2: "+c2.hashCode());
		System.out.println("Class of c2 object is : "+c2.getClass());
	}
}
