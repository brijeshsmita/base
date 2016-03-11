package com.cg.singleton;

public class MySingleton {
	//step 1 declare private static var of same class type
	private static MySingleton instance;
	//step 2: private constructor
	private MySingleton() {
		System.out.println("Only 1 object will be created");
	}
	//step 3: provide getInstance method and check if instance is null then
	//create a new object or return the existing object
	public static MySingleton getInstance() {
		if(instance==null){
			instance= new MySingleton();
		}
		return instance;
	}	
}
