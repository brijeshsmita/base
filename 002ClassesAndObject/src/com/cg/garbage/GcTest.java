package com.cg.garbage;

/*
*Garbage collector is a utility 2 handle memory management in java
* it checks for object which is no more longer in use
* Implicitly de-freeze or de-allocates the memory by giving
* a call back to finalize() method of Object class
*/
public class GcTest {
	public static void main(String[] args) {
		MyClass c1 ;
		c1 = new MyClass();
		c1=null;
		//System.gc();//we are requesting gc to deallocate the memory 
		Runtime.getRuntime().gc();
		//which is no more longer in use
		/*for(int i=1;i<=10000000;i++)
		{
			c1= new MyClass();
			c1=null;
		}*/
	}
}//end of class GcTest

class MyClass{
	public MyClass() {
		System.out.println("Object created........");
	}
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("********************Object Destroyed...");
	}
}





