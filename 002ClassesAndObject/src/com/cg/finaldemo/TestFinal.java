package com.cg.finaldemo;
public class TestFinal {
	private final static String COMPANY_NAME;
	private final String address;//blank final
	//final var must be initialized
	//final var ARE ALSO KNOWN AS CONSTANT IN JAVA
	static{
		COMPANY_NAME="CG Pvt. LTd.";
	}	
	public TestFinal() {
		address="Vikhroli Mumbai";
		//final variable cannot be re-initialized
		//coName="CG Pvt. Ltd.";
	}
	public final void printFinal(){
		System.out.println("Printing Final.....");
	}
	//protected method are available to classes within the package 
	//and only to the subclass outside the package
	protected void display(){
		System.out.println("Displaying Final class");
	}
	public static void main(String[] args) {
	}
}
class Sub extends TestFinal{
	//final method cannot be overriden
	/*public final void printFinal(){
		System.out.println("Printing Final.....");
	}*/
}
final class FinalClass{
	//final class cannot be subclassed
}
//final class cannot be ionherited
/*class SubClass extends FinalClass{
	
}*/











