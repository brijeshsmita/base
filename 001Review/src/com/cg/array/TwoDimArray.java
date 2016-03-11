/**
 * 
 */
package com.cg.array;

/**
 * @author Brijesh
 *
 */
import java.util.Scanner;
public class TwoDimArray {
public static void main(String[ ] args) {
	int [ ][ ] marks = new int [3][3]; 
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < marks.length ; i ++) {
		System.out.println ("Enter marks of student "+(i+1));
		for (int j = 0; j < marks[i].length ; j++) {
			System.out.println ("Subject "+(j+1));
			marks [i][j] = sc.nextInt();  
		}//end of inner for
	}  //end of outer for
	
	//printing the marks
	/*for (int i = 0; i < marks.length ; i++) {
	     for (int j = 0; j < marks[i].length ; j++){
			System.out.print (marks[i][j]+" ");
	     }//end of inner for
	     System.out.println();
	}*/
	//enhanced for loop for 2d array
		for (int[ ]rowData : marks) {
			for (int colData : rowData){
				System.out.print (colData + " ");
			}//end of inner fior
		System.out.println();
		} //end of outer
	}
}
