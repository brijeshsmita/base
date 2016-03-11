import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 
{
	public void findPattern1() 
	{
		Pattern p = Pattern.compile("[a-d][^b-f][m-z]");
		
		Matcher m = p.matcher("hvdddddviiddddbvsohddd");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern2() 
	{
		Pattern p = Pattern.compile("\\d");
		
		Matcher m = p.matcher("hveibgilsgdddvib 45 nxgbodohvo4fvcgb54 44");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern3() 
	{
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher("hveibgilsgdddvib 45 nxgbodohvo4fvcgb54 44");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern4() 
	{
		Pattern p = Pattern.compile("\\w");
		
		Matcher m = p.matcher("hveibgilsgdddvib 45 nxgbodohvo4fvcgb54 44");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern5() 
	{
		Pattern p = Pattern.compile("5a*");
		
		Matcher m = p.matcher( "45aa5nxvo4fvcgb5sf4s4d54");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern6() 
	{
		Pattern p = Pattern.compile("5?");
		
		Matcher m = p.matcher( "4555nxvo4fvcgb5sf4s4d4");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern7() 
	{
		Pattern p = Pattern.compile("5+");
		
		Matcher m = p.matcher( "455nxvo4fvcgb5sf4s4d4");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
	public void findPattern8() 
	{
		Pattern p = Pattern.compile("\\d*");
		
		Matcher m = p.matcher( "45nxvo4fvcgb5sf4s4d4");
		while(m.find())
		{
			System.out.println(m.start()+"	"+m.end()+"	"+m.group());
		}
	}
}
