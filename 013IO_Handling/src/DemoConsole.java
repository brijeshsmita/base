import java.io.Console;
public class DemoConsole {
	public static void main(String[] args) {
		Console console = null;
	      String inputString = null;
	      String password=null;
	      try  {    // creates a console object
	         console = System.console();
	         // if console is not null
	         if (console != null){
	            // read line from the user input	          
	        	 inputString = console.readLine("Enter Name: ");
	            // read line from the user input
	            password = 
	            	new String(console.readPassword("Enter Password: "));
	            // prints
	            System.out.println("Name entered : " 
	            + inputString+" and Password is : "+password);
	            // prints	           
	         }
	         else{
	        	 System.out.println("Console is null");
	         }//end of if
	      } catch (Exception ex)
	      {
	         ex.printStackTrace();
	      }
	}//end od method

}
