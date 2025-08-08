import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class App2 {

	public static void main(String[] args) {
		List<String> countries=Arrays.asList("India","Australia","Sri lanka","Pakistan","Bangladesh");
		List<String> result = countries.stream()
		.filter((t)->t.length()>5)
		.map((t)->t.toUpperCase())
		.collect(Collectors.toList());
		
		for(String c:result) {
			System.out.println(c);
		}
	}

}
