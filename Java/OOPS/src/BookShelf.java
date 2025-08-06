import java.util.Scanner;

public class BookShelf extends Furniture{
	int noOfShelves;

	@Override
	public void acceptDetails() {
		// TODO Auto-generated method stub
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of shelves:");
		noOfShelves=sc.nextInt();		
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.printf("There are %d shelves",noOfShelves);	
		
	}
	
	
}
