import java.util.HashSet;
import java.util.Set;

public class AppEmployeeHashSet {

	public static void main(String[] args) {
		Set<Employee> empSet=new HashSet<>();
		empSet.add(new Employee(1L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(2L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(3L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(1L, "Raja", "Tech", 1234567890.0));
		
		for(Employee emp:empSet)
		{
			System.out.println(emp);
		}
	}

}
