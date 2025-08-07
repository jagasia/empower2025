import java.util.Set;
import java.util.TreeSet;

public class Task6 {

	public static void main(String[] args) {
		Set<String> cities=new TreeSet<>();
		
		cities.add("Kochi");
		cities.add("Agra");
		cities.add("New Delhi");
		cities.add("Agra");
		cities.add("Thiruvananthapuram");
		cities.add("Kolkata");
		
		for(String s : cities) {
			System.out.println(s);
		}
	}

}
