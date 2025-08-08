import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
//		for(Integer x : stack) {
//			System.out.println(x);
//		}
		
		while(true) {
			System.out.println(stack.pop());
		}
	}

}
