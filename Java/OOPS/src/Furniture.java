import java.util.Scanner;

public class Furniture {
	String name;
	String color;
	
	public void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of the furniture:");
		name=sc.nextLine();
		System.out.println("Color:");
		color=sc.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("Name of the furniture is "+name);
		System.out.println("Color is "+color);
	}
	
	public void breakDown() {
		
	}
}
