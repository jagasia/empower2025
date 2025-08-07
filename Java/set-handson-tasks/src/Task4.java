import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<String> countries=Arrays.asList("India", "Australia", "Sri lanka", "Pakistan", "Bangladesh", "Japan", "Nepal", "Bhutan", "China", "Russia");
		Collections.sort(countries);
		Collections.reverse(countries);
		for(String c:countries) {
			System.out.println(c);
		}
	}

}
