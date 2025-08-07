import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		List<Person> persons=new ArrayList<>();
		persons.add(new Person("Sudheep", 40));
		persons.add(new Person("Yash", 32));
		persons.add(new Person("Raj Kumar", 100));
		persons.add(new Person("Puneeth", 39));
		persons.add(new Person("Shiva Raj", 42));
		
		Collections.sort(persons);
		
		for(Person p:persons) {
			System.out.println(p);
		}
	}

}
