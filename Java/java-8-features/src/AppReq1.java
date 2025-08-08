
public class AppReq1 {

	public static void main(String[] args) {
		Operation op1=(x,y)->x+y;
		Operation op2=(x,y)->x*y;
		System.out.println(op1.perform(10, 5));
		
		System.out.println(op2.perform(10, 5));
	}

}
