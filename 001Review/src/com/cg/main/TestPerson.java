
package com.cg.main;

import java.io.ObjectInputStream.GetField;

import com.cg.person.Person;

/**
 * @author Brijesh
 *
 */
public class TestPerson {

	public static void main(String[] args) {
		System.out.println("In Main()....");
		Person p1 = new Person();
		System.out.println(p1);//string will be printed
//whenever we try to print object
//callback is given to toString() method of the class
//if the class does not have toString() Method 
		//then Object class toString is invoke
		
		Person p2 = new Person();
		System.out.println(p2);

		Person p3 = new Person();
		System.out.println(p3);

		Person p4 = new Person();
		System.out.println(p4);
		System.out.println("Total number of person is :"
				+Person.getPersonCount());
		System.out.println("Nationtionalty is :"
				+Person.getNationality());
	}

}
