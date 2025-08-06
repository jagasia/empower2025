


public class Employee {
	private Integer id;
	private String name;
	private static String department;
	private static String companyName="Empower";	//why? this is static
	
	public Employee() {
		//here we can write initialization code that is
		//automatically called during object creation
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
