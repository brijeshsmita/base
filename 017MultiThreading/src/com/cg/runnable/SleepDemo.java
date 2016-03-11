package com.cg.runnable;
//step 1: create a class and implements Runnable
public class SleepDemo implements Runnable{
//step 2 :	Override Run
	@Override
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+",");	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}//end of run
	public static void main(String[] args) {
		Runnable r = new SleepDemo();
		Thread t1 = new Thread(r,"T1");
		t1.start();
		
		Thread t2= new Thread(r,"T2");
		t2.start();
	}//end of main
}//end of class

