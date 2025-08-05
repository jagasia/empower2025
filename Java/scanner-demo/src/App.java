import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your employee id:");
		int employeeId=sc.nextInt();
		
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		if(name.equals("")) {
			name=sc.nextLine();
		}
		System.out.print("Enter your score:");
		float score=sc.nextFloat();
		
		System.out.printf("Employee id:%d\nEmployee Name:%s\nScore:%f\n",employeeId,name,score);
		
	}

}
