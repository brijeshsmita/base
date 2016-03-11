package com.cg.executor;
/*The ExecutorService interface represents an asynchronous execution
 *  mechanism which is capable of executing tasks in the background. 
 *  An ExecutorService is thus very similar to a thread pool. 
 *  This java program creates an ExecutorService with a pool 
 *  size of two, then it submits five threads to it. 
 *  Notice that only two threads run at a time.
*/
import java.util.concurrent.*;
import java.util.Date; 
public class ExecutorServiceTest { 
   public static void main(String[] args) { 
      // executor service with pool size of two
      ExecutorService service=Executors.newFixedThreadPool(2); 
      // starting 5 threads
      for(int i=1; i<=5; i++) {
         Worker worker=new Worker();
         service.execute(worker);
      } 
      service.shutdown();
   }
} 
class Worker extends Thread {
   public void run() {
	   int count=1;
      try {
         System.out.println(this.getName() + " started working at : " 
        		 + new Date() );
         Thread.sleep(5000);
         System.out.println(this.getName() + " finished working at :" 
        		 + new Date() );
      } catch (Exception e) {
      }
   }
}