package com.cg.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SimpleThreadPool {
	 
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <=10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
 
}
/*
we are creating fixed size thread pool of 5 worker threads. 
Then we are submitting 10 jobs to this pool, since the pool size is 5, 
it will start working on 5 jobs and other jobs will be in wait state,
 as soon as one of the job is finished, another job from the wait queue 
will be picked up by worker thread and get’s executed.
*/
/*A thread pool manages the pool of worker threads, 
 *it contains a queue that keeps jobss waiting to get executed.

A thread pool manages the collection of Runnable threads 
and worker threads execute Runnable from the queue.

java.util.concurrent.Executors provide implementation 
of java.util.concurrent.Executor interface 
to create the thread pool in java. 
*/
class WorkerThread implements Runnable {     
    private String jobs;     
    public WorkerThread(String s){
        this.jobs=s;
    } 
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
        		+" Start. jobs = "+jobs);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End.");
    }
    @Override
    public String toString(){
        return this.jobs;
    }
}
/*******************we are creating fixed thread pool from Executors framework.
****************************/
