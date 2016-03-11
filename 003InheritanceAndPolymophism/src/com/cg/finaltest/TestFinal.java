package com.cg.finaltest;
public class TestFinal {
	public static void main(String[] args) {
	}
}//end of TestFinal class
class MyClass{
	//final var must be initialized and cannot be re-initialized
	//finAL VAR IS ALSO KNOWN AS CONSTANT IN JAVA
	// must be declared all in caps seperated by underscore
	private final static float PI=3.14f;
	private final String CO_NAME;//BLANK FINAL
	private static int MY_VAR;
	static{
		MY_VAR=10;
	}
	//init block
	{
		CO_NAME="CG India Pvt. Ltd. Mumbai";
	}
	public MyClass() {
		//error//PI=3.141f;//we cannot re-initialize final var
		//CO_NAME="CG India Pvt. Ltd. Mumbai";
	}
	final void myFinalMethod(){
		System.out.println("Final Method");
	}
}//end of MyClass
class FinalMethodTest extends MyClass{
	//final method cannot be overridden
	//error
	/*void myFinalMethod(){
		
	}*/
}//end of FinalMethodTest
final class MyFinalClass{
	//final class cannot be extended or sub-classed
	String name;
	
}//end of MyFinalClass
//error
/*class NewClass extends MyFinalClass{
	
}*/

















