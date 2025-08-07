import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Integer> marks = new HashSet<>();
		marks.add(90);
		marks.add(10);
		marks.add(10);
		marks.add(10);
		marks.add(20);
		marks.add(10);
		marks.add(30);
		
		
//		System.out.println(marks.size()); 		//output is 7
		
//		Collections.sort(marks);		//not possible
		System.out.println(marks);
	}

}
