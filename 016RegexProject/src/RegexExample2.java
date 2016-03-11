/*
 1> [abc]					 a, b, or c (simple class)
 2> [^abc]				 	 Any character except a, b, or c (negation)
 3> [a-zA-Z]				 a through z or A through Z, inclusive (range)
 4> [a-d[m-p]]				 a through d, or m through p: [a-dm-p] (union)
 5> [a-z&&[def]]			 d, e, or f (intersection)
 6> [a-z&&[^bc]]			 a through z, except for b and c: [ad-z] (subtraction)
 7> [a-z&&[^m-p]]			 a through z, and not m through p: [a-lq-z](subtraction)
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;  
 public class RegexExample2{  
	 public static void main(String args[]) throws IOException{  
		 System.out.println(Pattern.matches("[amn]", "abcd"));				//false (not a or m or n)  
		 System.out.println(Pattern.matches("[amn]", "a"));					//true (among a or m or n)  
		 System.out.println(Pattern.matches("[amn]", "amn"));
		 System.out.println(Pattern.matches("[amn]?", ""));				//false (not a or m or n)  
		 System.out.println(Pattern.matches("[amn]*", ""));//true (among a or m or n zero or more occurrance)
		 System.out.println(Pattern.matches("[amn]+", "aaaaaaaa"));
		 System.out.println(Pattern.matches("[amn]+", "aaammmnnn"));
		 System.out.println(Pattern.matches("[amn]+", ""));
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "smit99"));
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "1Smi99"));
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "123456"));
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));																//true//false (m and a comes more than once)
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7953038949"));
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "6953038949"));
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7777777777"));
		 //the number should start with either 7,8,or 9
		 //followed by 9 digit from 0-9
		 //therefore total length must be of 10 digit
		 System.out.println("Enter full Name (Only Characters)length <25");
		 String strName=null;
			//accepting input with the help of BufferedReader
		 try(
				 InputStreamReader in = new InputStreamReader(System.in);
				 BufferedReader br = new BufferedReader(in);
				 ){
			 strName=br.readLine();
		 }//end of try
		 System.out.println(Pattern.matches("[a-zA-Z\\s]{6,24}", strName));
		 String strPass="Smita@123";
		 String passPattern="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";//for alfa-numeric
		 String strEmail="Smita123@gmail.com";
		 String emailPattern="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
	 }
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 System.out.println(Pattern.matches("[amn]*", "a"));  
		 System.out.println(Pattern.matches("[amn]+", "ammmna"));//false (m and a comes more than once)  
		//for name String pattern="[a-zA-Z\\s]+"
		//for alfa-numeric String pattern="[a-zA-Z\\s0-9]+"
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "smit99"));//true  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "bksmita99"));//false (more than 6 char)  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		 System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "smita$2"));//false ($ is not matched)
		 System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true//false (m and a comes more than once)
 */