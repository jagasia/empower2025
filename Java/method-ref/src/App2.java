
public class App2 {

	public static void main(String[] args) {
		Maths m=new Maths();
		Calculator calc=m::sum;
		
		System.out.println(calc.operate(2, 3));
	}

}
