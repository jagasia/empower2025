import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
		marks.add(72);
		marks.add(18);
		marks.add(92);
		marks.add(10);
		marks.add(11);
		marks.add(22);
		marks.add(13);
		
		Collections.sort(marks, new DescendingIntegerComparator());
		
		for(Integer x:marks) {
			System.out.println(x);
		}
		
	}

}
