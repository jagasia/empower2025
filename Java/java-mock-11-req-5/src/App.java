import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the colleges:");
		int noOfColleges=sc.nextInt();
		List<College> colleges=new ArrayList<>();
		for(int i=0;i<noOfColleges;i++) {
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			College college=College.createCollege(detail);
			colleges.add(college);
		}
		
		System.out.println("Enter a type to sort:\r\n"
				+ "1.Sort by name\r\n"
				+ "2.Sort by number of departments\r\n"
				+ "3.Sort by starting date");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:		//sort by name
			break;
		case 2:		//sort by number of departments
			break;
		case 3:		//sort by starting date
			break;
		}
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		
		System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", "Name","Website","Mobile","Founder","No of departments","Location","Starting date");
		for(College c:colleges) {
			System.out.format("%-15s %-20s %-15s %-15s %-20s %-15s %s\n", c.getName(),c.getWebsite(),c.getMobile(),c.getFounder(),c.getNumberOfDept(),c.getLocation(),sdf.format(c.getStartingDate()));
		}
	}

}
