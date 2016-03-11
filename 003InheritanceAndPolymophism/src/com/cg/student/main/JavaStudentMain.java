package com.cg.student.main;
import com.cg.student.Student;
import com.cg.student.java.JavaStudent;
public class JavaStudentMain {
	public static void main(String[] args) {
		JavaStudent js1 = new JavaStudent("Sia", "Gupta",
			"sia@gmail.com.com", "Mumbai", "7658987877", 567,78.8);
		js1.print();
		JavaStudent js2 = new JavaStudent("Jia", "Gupta",
			"jia@gmail.com.com", "Delhi", "8326436346", 345,79.9);
		js2.print();
		JavaStudent js3 = new JavaStudent("Ria", "Sen",
			"ria@gmail.com.com", "Pune", "95265775673", 765,98.8);
		js3.print();
	}

}
