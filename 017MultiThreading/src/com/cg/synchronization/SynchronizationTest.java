package com.cg.synchronization;

public class SynchronizationTest extends Thread{
	Table t1 = new Table();Table t2 = new Table();
	public static void main(String[] args) {
		
		SynchronizationTest s = new SynchronizationTest();
		s.start();
		
	}

	@Override
	public void run() {
		t1.printTable(10);
		t2.printTable(100);
	}
}
class Table {
	public void printTable(int num1) {
		for(int i = 1;i<=10;i++){
			System.out.println(i*num1);
		}		
	}
}