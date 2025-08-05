import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int value1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int value2=sc.nextInt();
		
		if(value1<0 || value1>6 || value2<0 || value2>6) {
			System.out.println("Invalid Input");
//			System.exit(0);
			return;		//returns main method means, end of program execution
		}
		//if above if is not true, then only the below lines are executed.
		int sum=value1+value2;
		/*
		 *  int points=sum; if(value1==value2) { // points=sum*2;
		 * this is same as below points*=2; }
		 * 
		 * System.out.printf("The points scored is %d",points);
		 */
		
		System.out.printf("The points scored is %d",(value1==value2)?2*sum:sum);
	}

}
