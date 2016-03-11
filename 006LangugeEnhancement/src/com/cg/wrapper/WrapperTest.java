package com.cg.wrapper;
/*@author SmitaBrijesh*/
public class WrapperTest {
	public static void main (String args[ ]) {
		int i=10;//declaring int data
		
		Integer iObj= new Integer(i);//boxing
		fun(iObj);
		fun(100);//auto-boxing
		
	}
	public static void fun (Integer iObj) {
		System.out.println ("The value is : " + iObj.intValue());//unboxing
	}
}
/*Wrapper class provides the mechanism to converts primitives into object
and objects into primitive.
Java5 onwards autoboxing features converts objects into primitives automatically
and auto-unboxing automatically converts primitives to objects
There is a list of eight final wrapper class in java.lang package
1>Number
	1>int 	-Integer	5>float		-Float
	2>byte	-Byte		6>double	-Double
	3>short -Short		
	4>long  -Long		

7>boolean	-Boolean
8>char		-Character
	
					
================================Usage of Wrapper======================
1>String to different data type formats(parsing operation
*/
