package selenium;

public class ExecutionOrder {
	
	//Static variables
	static int counter1; 
	
	//Member variables
	String message;	
	int counter2;

	//Static initializer
	static {
		System.out.println("Inside static initializer block");
	}
	
	//Instance initializer
	{
		System.out.println("Inside instance initializer block");
	}
	
	//Constructor
	public ExecutionOrder() {
		counter1 = counter1 + 1;
		counter2 = counter2 + 1;
	}
	
	
	//Methods
	
	
	
}
