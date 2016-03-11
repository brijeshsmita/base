package com.cg.runnable;

public class JoinDemo implements Runnable{

	@Override
	public void run() {//T1 has to print from 1 to 25
		//T1 has to print from 26 to 50
		String tname=Thread.currentThread().getName();
		System.out.println("\n==========="+tname +"=============\n");
		if(tname.equals("T1")){
			for (int i = 1; i <= 25; i++) {
				System.out.print(i+",");				
			}//end of for
		}//end of if
		if(tname.equals("T2")){
			for (int i = 26; i <= 50; i++) {
				System.out.print(i+",");				
			}
		}//end of if			
	}//edn of run
	public static void main(String[] args) {
		Runnable r = new JoinDemo();
		Thread t1 = new Thread(r,"T1");
		t1.start();
		Thread.yield();
		/*
		 * Causes the currently executing thread to sleep
		 *  (temporarily cease execution)
		 */
		/*try {
		t1.join();
		//t1 has to complete then only the next waiting thread
		//can join t1 or start its work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		Thread t2= new Thread(r,"T2");
		t2.start();		
	}
}
