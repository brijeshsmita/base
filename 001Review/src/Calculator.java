
public class Calculator {
	//method to add two float literals
	public float add(float n1,float n2)
	{
		return n1+n2;
	}
	//method to substract two float literals
	public float substract(float n1,float n2)
	{
		return n1-n2;
	}
	//method to multiply two float literals
	public float multiply(float n1,float n2)
	{
		return n1*n2;
	}
	//method to divide two float literals
	public float divide(float n1,float n2)
	{
		return n1/n2;
	}
	public static void main(String[] args) {
		// creating an object of Calculator class
		int n1=10,n2=5;
		Calculator c1 = new Calculator();
		System.out.println("Addition of Two Numbers "+c1.add(n1, n2));
		System.out.println("Substraction of Two Numbers "+c1.substract(n1, n2));
		System.out.println("Multiplication of Two Numbers "+c1.multiply(n1, n2));
		System.out.println("Division of Two Numbers "+c1.divide(n1, n2));
	}//end of main

}//end of class Calculator
