/**
 * 
 */
package com.cg.garbage;

/*** @author SmitaBrijesh*/
public class GcTest {
	public static void main(String[] args) {
		MyClass c1;
/*		c1=new MyClass();
		c1=null;
		System.gc();//requesting gc and we cant force gc
*/		
		/*for(int i=1;i<=100000;i++){
			 c1= new MyClass();
			c1=null;//c1 is eligible for garbage collection
		}*/
			
/*
*Garbage collector is a utility 2 handle memory management in java
 * it checks for object which is no more longer in use
 * Implicitly de-freeze or de-allocates the memory by giving
 * a call back to finalize() method of Object class
 */
	}
}
class MyClass{
	public MyClass(){
		System.out.println("MyClass object created.....");
	}

	@Override
	protected void finalize()  {
System.out.println("***********MyClass object destroyed*********");
	}
	
}