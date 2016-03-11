package com.cg.overloading;
/*Method overloading is the concept of having method of same name
 * with different parameter/argument list,
 * return type may or may not be same
 * different argument list means:
 * 1> number of arguments
 * 2> data type of arguments
 * 3> sequence of argument list
 */
public class GenerateBill {
	/*public void add(int n1, double n2){
		System.out.println("Addition of add(int n1, double n2) is :"
				+(n1+n2));
	}
//number of arguments
	public void add(int n1, double n2,double n3){
		System.out.println("Addition of add(int n1, double n2,double n3) is :"
				+(n1+n2+n3));
	}
//data type of arguments
	public void add(int n1, float n2,float n3){
		System.out.println("Addition of add(int n1, float n2,float n3) is :"
				+(n1+n2+n3));
	}
//sequence of argument list
	public void add(double n1,double n2, int n3){
		System.out.println("Addition of add(double n1,double n2, int n3) is :"
				+(n1+n2+n3));
	}*/
/*Var-Args is aloso known as variable argument 
 * which is dynamic array creation at runtime
 * number of argument decide the size of array
 * 1> we can have only one var-arg in a parameter list
 * 2> it should be the last parameter in the arg-list 
 */
	public void add(double ... numArr){
		double sum=0;
		for(double num :numArr){
			sum+=num;
		}
		System.out.println("Bill Amount is :"+sum);
	}
	public void add(String customerName,double ... numArr){
		double sum=0;
		for(double num :numArr){
			sum+=num;
		}
		System.out.println("Hello ,"+customerName+" \nBill Amount is :"+sum);
	}
	public void add(int billNo,String customerName,double ... numArr){
		double sum=0;
		System.out.println("Bill No:"+billNo
				+"\nHello ,"+customerName);
		for(double num :numArr){
			System.out.println(num);
			sum+=num;
		}
		System.out.println("Total Bill Amount is :"+sum);
	}
	public static void main(String[] args) {
		GenerateBill b1 = new GenerateBill();
//calling of method in overloading
//is decided at runtime by the java compiler, by argument list
		b1.add(10, 10.5);
		b1.add(10, 10.5,17.6);
		b1.add(10, 10.5f,17.6f);
		b1.add(10.7, 10.5,17);
		b1.add("Smita",10.7, 10.5,17);
		b1.add(101,"Smita",10.7, 10.5,17,103,30,578,899,34);
	}
}
