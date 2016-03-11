package com.cg.polymorphism;

import com.cg.student.Student;
import com.cg.student.java.JavaStudent;

public class TestPolymorphism {
	public static void main(String[] args) {
		Student[] sArr = new Student[3];
		Student s1;
		s1= new Student();
		sArr[0]=s1;
		s1= new JavaStudent();
		sArr[1]=s1;
		s1= new OracleStudent();
		sArr[2]=s1;
		
		for(Student s:sArr){
			s.print();
		}		
	}

}
