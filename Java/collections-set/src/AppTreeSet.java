import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String[] args) {
		Set<Integer> marks = new TreeSet<>();
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
