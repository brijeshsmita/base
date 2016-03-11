package com.cg.trycatch;
public class MultipleCatch {
	public static void main(String[] args) {
		int n1,n2;
		double div=0;
		try {
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			div=n1/n2;
			System.out.println("Division is "+div);
		}catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Kindly enter the Array Value");
		}catch(NumberFormatException e){
			System.out.println("Kindly enter only numeric value ");
		}catch(Exception e){
			System.out.println("Sorry Boss!! Something went wrong"+e);
		}finally{
			System.out.println("Hi I am finally....executed always");
			System.out.println("Bye Bye...  Thankyou for using my App");
		}
/*
 * multiple catch should appear in sub-class to super-class hierarchy
 */
	}
}
