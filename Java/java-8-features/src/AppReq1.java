
//@FunctionalInterface
//public interface Operation {
//	int perform(int a, int b);
//}

class JMaths{
	public int add(int a, int b) {
		return a+b;
	}
	
	public static int difference(int a, int b) {
		return a-b;
	}
}

public class AppReq1 {

	public static void main(String[] args) {
		Operation op1=(x,y)->x+y;		//lambda, so, i wrote implementation here
		Operation op2=(x,y)->x*y;		//lambda, so, i wrote implementation here
//		System.out.println(op1.perform(10, 5));
//		System.out.println(op2.perform(10, 5));
		
		JMaths m=new JMaths();
		Operation op3=m::add;		//method reference
		Operation op4=JMaths::difference;
//		System.out.println(op3.perform(5, 6));
		System.out.println(op4.perform(6, 3));
	}
}