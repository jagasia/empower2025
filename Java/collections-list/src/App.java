import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<>();
		marks.add(90);
		marks.add(10);
		marks.add(10);
		marks.add(10);
		marks.add(20);
		marks.add(10);
		marks.add(30);
		
		
//		System.out.println(marks.size()); 		//output is 7
		
		Collections.sort(marks);
		System.out.println(marks);
	}

}
