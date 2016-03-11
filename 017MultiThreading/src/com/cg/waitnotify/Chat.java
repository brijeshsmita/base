package com.cg.waitnotify;
public class Chat {
	boolean flag=false;
	public synchronized void question(String msg){
		if(flag){
			try {
				wait();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end of if
		System.out.println(Thread.currentThread().getName()+ " "+msg);
		flag=true;
		notify();
	}
	public synchronized void answere(String msg){
		if(!flag){
			try {
				wait();
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//end of if
		System.out.println(Thread.currentThread().getName()+ " "+msg);
		flag=false;
		notify();
	}
}
class Person1 implements Runnable{
	Chat chat;
	
String [] msg={"Hi !","How Are you ?","I am perfect! "};
	public Person1(Chat chat) {
		super();
		this.chat = chat;
		new Thread(this, "Ramesh : ").start();
		
	}
	@Override
	public void run() {		
		for(String i: msg)
			chat.question(i);
	}	
}//end of class person1
class Person2 implements Runnable{
	Chat chat;
String [] msg={" Hey Hi !","I am doing good, how about u ?"
			,"Thats Great! "};
	public Person2(Chat chat) {
		super();
		this.chat = chat;
		new  Thread(this, "Suresh : ").start();
	}
	@Override
	public void run() {		
		for(String i: msg)
			chat.answere(i);
	}	
}//end of class person2