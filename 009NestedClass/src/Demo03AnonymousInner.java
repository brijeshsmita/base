
/*
 * @author Smita Brijesh
 */
public class Demo03AnonymousInner {
	
}
abstract class Project{
	abstract void prepareProject();
}
class Trainee{
	
}
class JavaTrainee extends Trainee{
	public static void main(String[] args) {
		/*
		 * at the time of declaration of an object
		 * if body appears then it is an anonymous inner class 
		 * or sub-class which does not have any name
		 */
		Project p = new Project() {			
			@Override
			public void prepareProject() {
				System.out.println("Trainees should Complete there projects");
				
			}
		};
		p.prepareProject();
	}
}
class Tablet extends Mobile
{
	public static void main(String[] args) 
	{		//At the time of declaration of an object if the body appears 
				// it is known as Anonymous inner class i.e. subclass of the class is created 
				//which does not have any name
		MsOffice obj = new MsOffice(){
			public void writeExcel(){
				System.out.println("Tab is preparing reports though Excel Document....");
			}
		};//end of anonymous inner class
		obj.writeDoc();
	}
}
class Mobile{
	public void call(){
		System.out.println("Making a call...");
	}
}
class MsOffice{
	public void writeDoc(){
		System.out.println("Writing CV through word document....");
		
	}
	public void writeExcel(){
		System.out.println("preparing reports through excel document....");
		
	}
	public void writePPT(){
		System.out.println("Prepating presentations through ppt Document....");
	}
}