package com.cg.generic;
import java.lang.Number;
import java.util.ArrayList;
/*
 * @author Smita Brijesh
 */
public class WildCardChar 
{	//?-represents an unknown type
	public static  void doIteration(ArrayList<?>list){
		for(Object obj :list){
			System.out.println(obj);
		}
	}//end of method	
	public static void main(String[] args) {	
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("Smita");
		strlist.add("Brijesh");
		strlist.add("Kumar");
		strlist.add("Nilesh");
		doIteration(strlist);
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee());
		emplist.add(new Employee());
		emplist.add(new Employee());
		emplist.add(new Employee());
		doIteration(emplist);
		
		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(100);
		intlist.add(140);
		intlist.add(1440);
		intlist.add(1556);
		
		doIteration(intlist);
		
		ArrayList<Float> floatlist = new ArrayList<>();
		floatlist.add(1554.54f);
		floatlist.add(1554.54f);
		floatlist.add(1554.54f);
		floatlist.add(1554.54f);
		floatlist.add(1554.54f);
		
		doIteration(floatlist);
	}
	
}
/*
 * Having wild cards at different places have different 
 * meaning
 * 1> Collection<?> denotes all instantiation of the
 * collection interface regardless of the type of argument.
 * 2>List<? extends Number> denotes all list types where 
 * the element type is a sub-type of Number.
 * 3>Comparator<? super String> denotes all instantiation
 * of the Comparator interface for the type argument types
 * that are super types of String
 * -->Unbounded wildcard parameterized type
 * A generic type where all type of arguments are the
 * unbound wildcard "?" without any restriction on type
 * variable eg:
 * ArrayList<?> list = new ArrayList<Long>();
 *list = new ArrayList<String>();
 * list = new ArrayList<Employee>();
 * 
 * */
