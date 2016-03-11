/**
 * 
 */
package com.cg.operator;

/**
 * @author Brijesh
 *Bitwise and BitShift Operators in Java 
 *- AND, OR, XOR, Signed Left and Right shift Operator Examples
 */
public class TestBitwiseOperators {
/*
 * Bitwise and Bit Shift operators in Java are powerful 
 * set of operators which allows you to manipulate bits 
 * on integral types like int, long, short, bytes 
 * and boolean data types in Java. Bitwise and Bit shift 
 * operator are among the fastest operator in Java 
 */
	  public static void main(String args[]) {
	     int a = 60;	/* 60 = 0011 1100 */  
	     int b = 13;	/* 13 = 0000 1101 */
	     int c = 0;

	     c = a & b;       /* 12 = 0000 1100 */ 
	     System.out.println("a & b = " + c );

	     c = a | b;       /* 61 = 0011 1101 */
	     System.out.println("a | b = " + c );

	     c = a ^ b;       /* 49 = 0011 0001 */
	     System.out.println("a ^ b = " + c );

	     c = ~a;          /*-61 = 1100 0011 */
	     System.out.println("~a = " + c );
	  //not applicable on boolean
/*Bitwise unary complement operator changes bits from 0 to 1,
 *  or vice versa and can only be applied on integral types.*/
/*
 * Apart from bitwise operators, Java also provides 
 * bit shift operators, which can be used to shift bit from one 
* position to another on both left and right side in a number.*/	     
	     c = a << 2;     /* 240 = 1111 0000 */
	     System.out.println("a << 2 = " + c );
//Left shift operator with sign, shifts bit into left side 
	     //and fill the empty place with zero
	     c = a >> 2;     /* 215 = 1111 */
	     System.out.println("a >> 2  = " + c );
//right shift operator with sign, shifts the bit on right side 
	     //and fills the empty place with value of sign bit
//For positive number it fills with zero and 
	     //for negative numbers it fills with 1.
	     c = a >>> 2;     /* 215 = 0000 1111 */
	     System.out.println("a >>> 2 = " + c );
//">>>" right shift without sign operator will only shift 
	 //the bit towards right without preserving sign of number.
	  
	  }//end of main
	} 