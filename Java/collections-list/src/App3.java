import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App3 {

	public static List<Integer> removeDuplicates(List<Integer> input) {
		//write your code here
		//convert list into set
		Set<Integer> set=new LinkedHashSet<>(input);
		//convert set into list. then return that list
		List<Integer> result=new ArrayList<>(set);
		return result;
	}
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(91,28,73,46,54,54,35,62);
		List<Integer> result = removeDuplicates(list);
		System.out.println(result);
	}

}
