import java.util.Scanner;

public class App {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		//to access each digit of the input number
		
		int temp=input;
		int reverse=0;
		
		while(temp>0) {
			int digit=temp%10;
			reverse*=10;
			reverse+=digit;
			
			temp/=10;
		}
		
		//check if input == reverse
		if(input==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
