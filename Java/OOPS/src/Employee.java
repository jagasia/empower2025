


public class Employee {
	private Integer id;
	private String name;
	private static String department;
	private static String companyName="Empower";	//why? this is static
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		super();
	}
	public static void display() {
		//i want to update the department
		department="IT";
		System.out.println(companyName);
	}
	public void speak() {
		id=1;
		name="Raja";
		department="IT";
		System.out.println("Employee speaks");
	}
	
	public static void main(String[] args) {
		System.out.println("First line of main");
		Employee.display();
		Employee raja=new Employee();
//		raja.display();
		Employee.display();
		raja.speak();
	}
}
