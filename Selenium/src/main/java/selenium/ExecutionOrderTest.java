package selenium;

public class ExecutionOrderTest {

	public static void main(String[] args) {
		ExecutionOrder executionOrder1 = new ExecutionOrder();
		System.out.println(executionOrder1.counter1);
		System.out.println(executionOrder1.counter2);
		ExecutionOrder executionOrder2 = new ExecutionOrder();
		System.out.println(executionOrder2.counter1);
		System.out.println(executionOrder2.counter2);
		
	}

}
