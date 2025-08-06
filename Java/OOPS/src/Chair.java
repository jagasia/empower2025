import java.util.Scanner;

public class Chair extends Furniture
{
	int noOfLegs;
	
	public int sum(int i, int j) {
		return i+j;
	}
	
	public String sum(String s1, String s2) {
		return s1+s2;
	}
	
	//overriding
	public void acceptDetails() {
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of legs:");
		noOfLegs=sc.nextInt();
	}
	
	
	public void displayDetails() {
		super.displayDetails();
//		System.out.println("There are "+noOfLegs+" legs");
		System.out.printf("There are %d legs", noOfLegs);
	}

	
	public void breakDown() {
		
	}
}
