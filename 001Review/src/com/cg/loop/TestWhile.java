/**
 * 
 */
package com.cg.loop;
/*
 * 
 */
/**
 * @author Smita Brijesh
 *
 */
public class TestWhile {
	
	public static void main(String[] args) {
		int num=19,i=1;//step 1: declaration
	/*	while(i<11)//step 2 : condition
		{
			System.out.println(num+" * "+i+" = "+(i*num));
			//step 3:increment or decrement
			i++;
		}*/
		//step 1: declaration
		System.out.println("with do while.....");
		int n1=17;
		i=1;
		do{//step 2 : do loop
			System.out.println(num+" * "+i+" = "+(i*num));
			//step 3:increment or decrement
			i++;
			
			//step 4: while(condition);
		}while(i<1);
		
	}
}
