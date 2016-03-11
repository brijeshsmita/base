package com.cg.thread;
//step 1: create a class which extends from Thread class
public class ThreadDemo extends Thread{	
	public ThreadDemo(){
		
	}
	public ThreadDemo(String string) {
		super(string);
	}
	//step 2 : override run() method and write business logic
	//Thread is in running state
	@Override
	public void run() {
		//to print number from 1 to 5
		//thread is in Running state
		//System.out.println("run() invoked");
		String threadName=Thread.currentThread().getName();
		String msg="Hello "+threadName+",You have to attend ";
		if(threadName.equals("T1")){
			msg+=",Java Training";
		}
		if(threadName.equals("T2")){
			msg+=",Oracle Training";
		}
		System.out.println(msg);
		/*for(int i=1;i<=5;i++)
		{
			System.out.println(i+" : "+Thread.currentThread().getName());
		}*/
	}//emd of run
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("T1");
		ThreadDemo t2 = new ThreadDemo("T2");
		t1.start();t2.start();
		/*
		 * invoking start()-creates a new Thread while
		 * invoking run() doesn't create a new Thread ,it simply execute
		 * 				in  current thread like a normal method call
		 */
		/*ThreadDemo t3 = new ThreadDemo();
		ThreadDemo t4 = new ThreadDemo();
		t3.start();t4.run();*/
/*//step 3 :create thread class object
		ThreadDemo t1 = new ThreadDemo();//thread born
		t1.setName("T1");
//step 4 :invoke start() method on thread object
		//System.out.println("Thread is Alive() "+t1.isAlive());
		//Thread is in ready to run() state
		t1.start();//callback is given to run()	
		//System.out.println("Thread is Alive() after start()"+t1.isAlive());
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("T2");
		t2.start();
		ThreadDemo t3 = new ThreadDemo();
		t3.setName("T3");
		t3.start();*/
		
	}//end of main
}//end of class
