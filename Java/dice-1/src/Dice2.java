import java.util.Scanner;

class Employee{
	int id;			//where
	String name;	//where
	
}


public class Dice2 {
	public static void main(String[] args) {
		Employee raja;
		raja=new Employee();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int value1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int value2=sc.nextInt();
		
		if(value1<0 || value1>6 || value2<0 ||value2>6) {
			System.out.println("Invalid Input");
			return;
		}
		
		int sum=value1+value2;
		int points=Math.abs(8-sum);
		if(sum>=8) {
			points*=2;
		}
		
		System.out.printf("The points scored is %d",points);
	}
}
