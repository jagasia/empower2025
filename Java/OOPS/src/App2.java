import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Shape s=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Triangle\r\n"
				+ "2: Rectangle");
		
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			s=new Triangle();
			break;
		case 2:
			s=new Rectangle();
			break;
		}
		
		s.calculateArea();		//no such methods
	}
	

}
