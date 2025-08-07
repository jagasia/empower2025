import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 city names:");
		List<String> cities=new ArrayList<>();
		for(int i=0;i<5;i++) {
			String city=sc.nextLine();
			cities.add(city);
		}
		int index=cities.indexOf("Chennai");
		
		System.out.println((index!=-1)?index:"City not found");
	}

}
