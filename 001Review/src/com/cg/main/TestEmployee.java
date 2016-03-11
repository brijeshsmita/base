/**
 * 
 */
package com.cg.main;

import java.util.Date;

import com.cg.emp.Employee;
//import com.cg.*;
//'.*' means all the classes only within the package 
//not the sub-package

/**
 * @author Smita Brijesh
 *
 */
public class TestEmployee {

	public static void main(String[] args) {
		//create employee object
		Employee e1;//reference variable
		//ref var is always created on stack
		e1= new Employee(11,"smita",9999.99,new Date());
		System.out.println(e1);
//static mean shared by all the object thus
//we should always invoke static method with ClassName.MethodName
		Employee.companyInfo();
		System.out.println("Total Employee :"+Employee.getEmpCount());
//how to access private var outside the class
//by providing getters and setters
		//also known as assessor and mutator
//Rules
		//1> Both getter and setter method must be public
//2> getter method is prefixed by get followed by var name
		//eg String key; getKey()
//3> getter method return type will be same data type of var
//4> getter method never accept any parameters
		//eg: public String getKey(){ return key; }
//1> setter method is prefixed by set followed by var name
		//eg String key; setKey()
//2> setter method return type void
//3> setter method will accept
	//parameters of the same data type of var
//eg: public void setKey(String key){ this.key=key; }
	}

}




