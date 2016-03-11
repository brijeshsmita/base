package com.cg.main;
import com.cg.trainee.Trainee;
public class TestTrainee {
	public static void main(String[] args) {
		Trainee t1 = new Trainee();	
		t1.print();
		System.out.println("\n============================\n");
		Trainee t2 = new Trainee(101, "nidhi", "IT",25000.9);
		t2.print();
		t1.setName("HarLoveleen");
		t1.setId(102);
		System.out.println("t1 Id is :"+t1.getId());
		System.out.println("t1 Name is :"+t1.getName());
		System.out.println("What is the name of t2");
		System.out.println("t2 name is :"+t2.getName());
		System.out.println("t2 wants to set the correct name ");
		t2.setName("Nishi Garg");
		System.out.println("t2 new Name is "+t2.getName());
	}
}
