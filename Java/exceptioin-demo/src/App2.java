import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee();
		Long id=sc.nextLong();
		emp.setId(id);
		
		String name=sc.nextLine();
		if(name.equals(""))
			name=sc.nextLine();
		emp.setName(name);
		
		String email=sc.nextLine();
		try {
			emp.setEmail(email);
		} catch (Exception e) {
			System.out.println("Did you enter valid email?. Look at the message: "+e.getMessage());
		}
		
		String phone=sc.nextLine();
		try {
			emp.setPhone(phone);
		} catch (InvalidPhoneException e) {
			System.out.println("Did you enter valid phone?. Look at the message: "+e.getMessage());
		}
		
		System.out.println(emp);
		
	}

}
