/**
 * 
 */
package com.cg.loop;

/**
 * @author Brijesh
 *
 */
public class BreakContinueWithLabel {	  
    public static void main(String args[]) {    
        int[] numArr= new int[]{102,12,21,30,31};      
        //Outer loop checks if number is multiple of 2
        OUTER:  //outer label
        for(int i = 0; i<numArr.length; i++){
            if(i % 2 == 0){
                System.out.println("Even number: " 
            + i + ", continue from OUTER label");
                continue OUTER;
            }//eo if          
            INNER:
            for(int j = 0; j<numArr.length; j++){
                System.out.println("Odd number: " 
            + i + ", break  from INNER label");
                break INNER;
            }//eo inner for
        }//e of outer for      
    }//eom
}//eoc


