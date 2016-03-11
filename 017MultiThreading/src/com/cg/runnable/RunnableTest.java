package com.cg.runnable;
//step 1: create a class and implements Runnable
public class RunnableTest implements Runnable{
//step 2 :	Override run
	@Override
	public void run() {
		//display Good Morning if it is T1
		//display Good Bye if it is T2
		String tname=Thread.currentThread().getName();
		if(tname.equals("T1")){
			System.out.println(tname+" says Good Morning");
		}
		if(tname.equals("T2")){
			System.out.println(tname+" says Good Bye");
		}
	}
	public static void main(String[] args) {
// step 3: create Runnable Object
		Runnable r = new RunnableTest();
		//r.start();
		//error-coz start() is the Thread class method
//step 4 :create Thread class obj by passing Runnable obj
		Thread t1 = new Thread(r);
		t1.setName("T1");
		//3rd type of Thread class constructor which takes
		//Runnable as a parameter
// strep 5: invoke start() on thread obj
		Thread t2= new Thread(r,"T2");
		t1.start();
		t2.start();
		
//4th type of constructor of Thread class which takes 
		//Runnable ,ThreadName as a parameter
		
	}//end of main
}//end of class
