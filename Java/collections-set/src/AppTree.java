import java.util.Set;
import java.util.TreeSet;

public class AppTree {

	public static void main(String[] args) {
		Set<Employee> empSet=new TreeSet<>();
		empSet.add(new Employee(101L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(2L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(13L, "Mithun", "Tech", 1234567890.0));
		empSet.add(new Employee(12L, "Raja", "Tech", 1234567890.0));
		
		for(Employee e:empSet)
			System.out.println(e);
		
	}

}
