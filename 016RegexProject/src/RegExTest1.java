import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExTest1 {
	public static void main(String[] args) {
//There are 2 core classes of java.util.regex
//1> java.util.regex.Pattern//2> java.util.regex.Matcher
//Pattern class is used to create patterns(regular expression)
//these patterns are precompiled expression, which 
//are capable of matching itself with a text.
/*Matcher class is used to match a given regular expression
 * with the help of Pattern instance
 * its looks for multiple occurrences of the regex in 
 * the text */		
		String pattern="[a-z]+";//+ one or more occurance
		String text="aHello1 Welcome2 to3 Regular4 Expression5";
		Pattern p= Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		while(m.find()){
			System.out.print(text.substring(m.start()
					,m.end())+"*");
		}
		System.out.println(Pattern.matches("[amn]?", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]*", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]+", "ammmna"));//false (m and a comes more than once)  
		//for name String pattern="[a-zA-Z\\s]+"
		//for alfa-numeric String pattern="[a-zA-Z\\s0-9]+"
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "smit99"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "bksmita99"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "smita$2"));//false ($ is not matched)
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
	}

}









