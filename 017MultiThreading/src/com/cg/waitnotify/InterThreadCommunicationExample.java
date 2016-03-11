package com.cg.waitnotify;
import java.util.LinkedList;
import java.util.Queue;
/* We have a shared Queue and two threads called Producer and Consumer. 
 * Producer thread puts number into shared queue and Consumer 
 * thread consumes numbers from shared bucket. Condition is 
 * that once an item is produced, consumer thread has to be 
 * notified and similarly after consumption producer thread 
 * needs to be notified. This inter thread communication is achieved 
 * using wait and notify method. Remember wait and notify method 
 * is defined in object class, 
 * and they are must be called inside synchronized block. */
public class InterThreadCommunicationExample {
    public static void main(String args[]) {
        final Queue sharedQ = new LinkedList();
        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);
        System.out.println("Producer and Consumer will start :");
        producer.start();
        consumer.start();
    }
}//end of class
class Producer extends Thread {   
    private final Queue sharedQ;
    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }
    @Override
    public void run() {
    	//produce Cakes
        for (int i = 1; i <=4; i++) {
            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                        System.out.println(":) Yeah! Queue is full, "
                    +Thread.currentThread().getName()+" Waiting ");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }//END OF WHILE
                System.out.println("Now , "+Thread.currentThread().getName()
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		
                		+"-producing : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}//end of class Poducer
class Consumer extends Thread {   
    private final Queue sharedQ;
    public Consumer(Queue sharedQ) {
        super("Consumer");
        this.sharedQ = sharedQ;
    }
    @Override
    public void run() {
        while(true) {
            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                        System.out.println(":( Opps! Queue is empty,"
                    +Thread.currentThread().getName()+" Waiting ");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (int) sharedQ.poll();
                System.out.println("Now , "+Thread.currentThread().getName()
                		+"-consuming : " + number );
                sharedQ.notify();              
                //termination condition
                if(number == 4){break; 
                }
            }
        }//end of outer while
    }//end of run
}//end of class


