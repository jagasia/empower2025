import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(17,82,39,14,51,26,73,48,95,10);
		
		marks.stream()
		.filter((t)->t%2!=0)
		.sorted()
//		.forEach((t)->System.out.println(t));
		.forEach(System.out::println);
	}
}