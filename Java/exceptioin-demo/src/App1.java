import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {		
		int i=20;
		int j=0;
		try {
		j=new Scanner(System.in)
.nextInt();	
		}catch(NumberFormatException ex) {
			System.out.println("data entered is invalid");
			return;
		}finally {
			System.out.println("This is first finally");
		}
		
		int k=0;
		
		
		try {
			k=i/j;
		}catch(ArithmeticException ex) {
			System.out.println("Arithmetic exception occurred. Error message is :"+ex.getMessage());
		}
		finally {
			System.out.println("This is finally");
		}
		
		System.out.println("This is last line");
	}

}
