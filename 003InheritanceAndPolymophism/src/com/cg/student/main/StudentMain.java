package com.cg.student.main;
import com.cg.student.Student;
public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("Sia", "Gupta", "sia@gmail.com.com"
				, "Mumbai", "7658987877", 567);
		s1.print();
		Student s2 = new Student("Jia", "Gupta", "jia@gmail.com.com"
				, "Delhi", "8326436346", 345);
		s2.print();
		Student s3 = new Student("Ria", "Sen", "ria@gmail.com.com"
				, "Pune", "95265775673", 765);
		s3.print();
	}
}
