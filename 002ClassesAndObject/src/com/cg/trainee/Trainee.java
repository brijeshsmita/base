/**
 * 
 */
package com.cg.trainee;
//step 1: package declaration
/**
 * @author SmitaBrijesh
 */
//step 2 : public class
public class Trainee {
//step 3 : private instance variables
	private int id;
	private String name;
	private String dept;
	private double salary;
//step 4 : No-Argument constructor
	public Trainee(){
		System.out.println("Trainee No-Argument constructor");
		id=0;
		name="unknown";
		dept="IT";
		salary=200000.00;
	}
	//overloaded constructor
	public Trainee(int i,String n,String d,double s){
		System.out.println("Trainee OverLoaded constructor");
		id=i;
		name=n;
		dept=d;
		salary=s;
	}
//step 5: business method/member methods
	public void print(){
		System.out.println("=====Trainee's Details====="
				+ "\nId		: "+id
				+ "\nName		: "+name
				+ "\nDepartment	: "+dept
				+ "\nSalary		: "+salary);
	}
//step 6: provide getters and setters for all private members

	//step 6: override toString() method
	public String toString(){
		return "===============Trainee's Details=============="
				+ "\nId		: "+id
				+ "\nName		: "+name
				+ "\nDepartment	: "+dept
				+ "\nSalary		: "+salary;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//step 7: client code i.e. main method
	public static void main(String[] args) {
		//create the object
	Trainee t1 = new Trainee(101, "Harshit", "IT", 999999.99);
	//	t1.initTrainee(101, "Harshit", "IT", 999999.99);
		System.out.println(t1);
	}
}
