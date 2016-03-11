/*
 * @author Smita Brijesh
 */
public class Demo04MethodLocalInner {
	public static void main(String[] args) {
		Car c = new Car();
	}
}
class Car{
	public void startCar(){	
		@SuppressWarnings("unused")
		class Engine{
			public void startEngine(){
				System.out.println("Starting the Engine");
			}
		}
		new Engine().startEngine();
		System.out.println("Running the car");
	}
}