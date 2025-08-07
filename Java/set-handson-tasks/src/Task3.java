import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(130,114,125,163,417,258,196,720,281,229);
		Collections.sort(values);
		Collections.reverse(values);
		
		for(Integer x:values) {
			System.out.println(x);
		}
	}

}
