/**
 * 
 */
package com.cg.wrapper;

/*@author SmitaBrijesh*/
public class WrapperTest {
	public static void main (String args[ ]) {
		int i=10;//declaring int data		
		Integer iObj= new Integer(i);//boxing
		fun(iObj);
		
	}
	public static void fun (Integer iObj) {
			System.out.println ("The value is : " 
					+ iObj.intValue());//unboxing
	}
}
