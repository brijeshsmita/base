package com.cg.runnable;
public class PriorityTest implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()
		+" ,is it Daemon Thread : "+Thread.currentThread().isDaemon());
	}
	public static void main(String[] args) {
		Runnable r = new PriorityTest();
		Thread t1 = new Thread(r,"T1");
		Thread t2= new Thread(r,"T2");
		Thread t3= new Thread(r,"T3");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(7);
		/*Thread.MAX_PRIORITY-10
		 * Thread.MIN_PRIORITY-1
		 * Thread.NORM_PRIORITY-5
		 */
		t1.setDaemon(true);
		//setting the thread to the lowest priority
		t1.start();
		t2.start();
		t3.start();
		
		//
		
	}//end of main
}//end of class
