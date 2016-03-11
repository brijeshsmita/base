package com.cg.array;

public class PascalTriangle {

	public static void main(String[] args) {
		int [][] pascalTriangle={{1},
								 {2,3},
								 {4,5,6},
								 {7,8,9},
								 {10,11,12}
								 };
		//printing pascal triangle
		System.out.println("========Printing Pascal Triangle=======");
		for(int[] row:pascalTriangle){
			for(int col:row){
				System.out.print(col+" ");
			}
			System.out.println();//new line
		}
		System.out.println("=======================================");
		char[][] names = new char[3][4];
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				names[i][j]=(char)(65+j);//65 ascii code for A
			}
		}//end of outer for
		//printing array
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();//new line
		}//end of outer for
	}//end of main
}
