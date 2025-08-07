import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(80,75,68,94,64,59,50);
		Collections.sort(marks);		//sort to asc
		Collections.reverse(marks);		//reverse to get desc
		//remove the lowest mark. lowest is the last element
		marks.remove(marks.size()-1);		//removing last element
		marks.add(1, 100);		//add at 2nd position
		
	}

}
