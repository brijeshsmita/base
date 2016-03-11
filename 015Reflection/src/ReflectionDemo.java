import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*
 * -Reflection is a process of fetching class information
 * 	at runtime
 * -it provides set of in built classes and method 
 * 	to fetch info about an object
 */
public class ReflectionDemo {
	public static void main(String[] args) {
		ReflectionDemo.getClassInfo(new Employee());
		//ReflectionDemo.getClassInfo(new Person());
	}
	private static void getClassInfo(Object obj) {
		Class c1= obj.getClass();
		System.out.println("Class Name is : "+c1);		
		c1.getClasses();
	//fetching info about constructor
		Constructor [] contrArr=c1.getConstructors();
		System.out.println("===========Constructor Info==========");
		for(Constructor i:contrArr ){
			System.out.println(i);
		}
		//fetching method info
		System.out.println("===========Method Info==========");
		Method [] methodArr= c1.getDeclaredMethods();
		for(Method i:methodArr){
			System.out.println(i);
		}		
		//fetching fields info
		System.out.println("===========Field Info==========");
		Field [] fieldArr= c1.getDeclaredFields();
		for(Field i:fieldArr){
			System.out.println(i);
		}
	}//end of method
			
}//end of class
