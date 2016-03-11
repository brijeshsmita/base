/**
 * 
 */


/**
 * @author Brijesh
 *
 */
public class BreakContinueWithLabel {	  
    public static void main(String args[]) {    
        int[] numArr= new int[]{102,12,21,30,31};      
        //Outer loop checks if number is multiple of 2
        OUTER:  //outer label
        for(int num = 0; num<numArr.length; num++){
            if(num % 2 == 0){
                System.out.println("Even number: " 
            + num + ", continue from OUTER label");
                continue OUTER;
            }//eo if             
            INNER:
            for(int i = 0; i<numArr.length; i++){
                System.out.println("Odd number: " 
            + num + ", break  from INNER label");
                break INNER;
            }//eo inner for
        }//e of outer for      
    }//eom
}//eoc


