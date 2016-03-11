package com.cg.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClient {
	public static void main(String[] args) {
		// Step1 : Create a Callable
		Callable callableTask = new CallableTask();
		// Step 2: Configure Executor
		// Uses FixedThreadPool executor
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<String> future = executor.submit(callableTask);
		boolean listen = true;
		while (listen) {
			if (future.isDone()) {
				String result;
				try {
					result = future.get();
					listen = false;
					System.out.println(result);
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}	//try
			}//if
		}//while
	}//main
}//class
