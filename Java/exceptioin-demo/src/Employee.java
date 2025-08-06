
public class Employee {
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	public Employee() {}

	public Employee(Long id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		//check the logic
//		email must have @ . etc
//		valid emails:
//			raja@yahoo.com
//			suresh@gmail.com
//
//		invalid emals:
//			raja@.com
//			suresh_gmail.com

		String regex="[A-Za-z]+[A-Za-z0-9]*[@][A-Za-z]+[.][a-z]{2,3}";
		
		if(email.matches(regex)) {
			this.email = email;	
		}else {
			throw new InvalidEmailException("Email address is invalid");
		}
		
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) throws InvalidPhoneException {
		String regex="[0-9]{10}";
		if(phone.matches(regex))
			this.phone = phone;
		else
			throw new InvalidPhoneException("Phone number is invalid");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
