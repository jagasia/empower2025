import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		Furniture f=new Furniture();
//		f.acceptDetails();
//		f.displayDetails();
		
//		Chair c=new Chair();
//		c.acceptDetails();
//		c.displayDetails();
		
		Scanner sc=new Scanner(System.in);
		Furniture f=null;
		
		System.out.println("1: Chair\r\n"
				+ "2: Book Shelf");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:		//chair
			f=new Chair();
			break;
		case 2:		//bookshelf
			f=new BookShelf();
			break;
		}
		
		f.acceptDetails();
		f.displayDetails();
		
	}

}
