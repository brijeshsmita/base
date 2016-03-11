/**
 * 
 */
package com.cg.array;

/**
 * @author Brijesh
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int tempVar=0;
				// 0  ,1 ,2 ,3, 4
		int arr[]={50,34,45,12,22};
		System.out.println("Array before Sorting : ");
		for(int i:arr){
			System.out.print(i+",");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr.length-i;j++){
				if(arr[j-1] > arr[j]){
                    tempVar = arr [j-1];
                    arr [j-1]= arr [j];
                    arr [j] = tempVar;
                }
			}
		}
		System.out.println("Array after Sorting: ");
		for(int i:arr){
			System.out.print(i+",");
		}

	}
	 /*
     * In bubble sort, we basically traverse the array from first
     * to array_length - 1 position and compare the element with the next one.
     * Element is swapped with the next element if the next element is greater.
     *
     * Bubble sort steps are as follows.
     *
     * 1. Compare array[0] & array[1]
     * 2. If array[0] > array [1] swap it.
     * 3. Compare array[1] & array[2]
     * 4. If array[1] > array[2] swap it.
     * ...
     * 5. Compare array[n-1] & array[n]
     * 6. if [n-1] > array[n] then swap it.
     *
     * After this step we will have largest element at the last index.
     *
     * Repeat the same steps for array[1] to array[n-1]
     *  
     */

}
