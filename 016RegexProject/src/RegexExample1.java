
	//There are three ways to write the regex example in java.
import java.util.regex.*;  
 public class RegexExample1{  
	 public static void main(String args[]){  
	 //1st way  
		 String input="has";
		 String regexPattern=".s";
	 Pattern p = Pattern.compile(regexPattern);//. represents single character  
	 Matcher m = p.matcher(input);  
	 boolean b = m.matches();  
	   
	 //2nd way  
	 boolean b2=Pattern.compile(regexPattern).matcher(input).matches();  
	   
	 //3rd way  
	 boolean b3 = Pattern.matches(regexPattern, input);  
	   
	 System.out.println(b+" "+b2+" "+b3);  
	 }
}
