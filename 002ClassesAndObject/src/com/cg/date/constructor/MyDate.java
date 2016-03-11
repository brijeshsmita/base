package com.cg.date.constructor;
class MyDate {
	private int day;
	private int month;
	private int year;	
	public MyDate(){
		System.out.println("MyDate() no-arg Contructor invoked...");
		day=month=year=1;//initializing to default value				
	}
	public MyDate(int day, int month, int year){
		System.out.println("MyDate Overloaded constructor invoked.....");
		this.day=day;
		this.month=month;
		this.year=year;
		/*explicit this reference is used only when local variable name
		 *and the instance variable name are same
		 */
	}
	public void print(){
		System.out.println(day+"-"+month+"-"+year);	
		//this reference is implicitly available
	}
	public String toString(){
		System.out.println("toString()....");
		return day+"-"+month+"-"+year;
	}
}
/*1>Constructor are the special kind of method
 *2> which has the same name as the Class Name
 *3> never has a return type
 *4> to initialize the newly created object
 *5> if a class has any constructor then,
 *  no default constructor will be provide by the java compiler
 *6> Constructors can be overloaded
 */	