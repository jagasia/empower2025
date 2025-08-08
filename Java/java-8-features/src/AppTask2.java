
public class AppTask2 {

	public static void main(String[] args) {
		GreetService gs=(name)->System.out.printf("Hello, %s! Welcome to Lambda Expressions.\n",name);
		
		gs.greet("Alice");
		gs.greet("Bob");
		
	}

}
