package com.cg.teststatic;

public class Customer{
	static int id;
	int custId;
	double custbal;
	//static init block
	/*static
	{
		System.out.println("static init-block");
		id=10001;
	}
	*/
	//init block
	{
		System.out.println("init-block");
		custId=10001;
	}
	//constructor
	public Customer() {
		custId=custId++;
		System.out.println("constructor");
	}
	public void print(){
		System.out.println(id);//static 
	}
	public static void main(String[] args) {
		System.out.println("TestStatic Id is : "+id);
		//non-static cannot be directly accessed within static context
//error		//System.out.println("CustId Id is : "+custId);
		Customer c1 = new Customer();
		System.out.println("CustId Id is : "+c1.getCustId());
	//non-static can be accessed through an object 
		Customer c2 = new Customer();
		System.out.println("CustId Id is : "+c2.getCustId());
		Customer c3 = new Customer();
		System.out.println("CustId Id is : "+c3.getCustId());

	}
//getters and setters
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Customer.id = id;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getCustbal() {
		return custbal;
	}
	public void setCustbal(double custbal) {
		this.custbal = custbal;
	}
	
}

