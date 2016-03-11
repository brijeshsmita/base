package com.cg.garbagecollector;
/*
 * Garbage collector is a utility which is used to
 * deallocate or de-freez the memory which is no more longer in use
 * It use to invoke Object class finalize() method to de-freez the memory
 * It is a low priority thread which run at the background.
 * It resolves the memory leakage.
 * 
 */
public class TestGc {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();		
		obj1=null;
		obj2=null;
		//System.gc();
		Runtime.getRuntime().gc();
		MyClass obj3;
		for (int i = 0; i <100000; i++) {
			obj3=new MyClass();
			obj3=null;
		}
	}	//end of main
}//end of TestGc class
class MyClass{
	static int countObj;
	public MyClass() {
		System.out.println(++countObj +" :Object created.....");
	}
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("***********Object destroyed, memory deallocated");
	}	
}//end of MyClass
