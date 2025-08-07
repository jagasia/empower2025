import java.util.List;
import java.util.ListIterator;

public class App2 {

	public static void main(String[] args) {
		List<Integer> list=List.of(11,2,5,3,9,12,7,8,10);

		ListIterator<Integer> it = list.listIterator(list.size());
		
		while(it.hasNext()) {
			Integer current = it.next();
			System.out.println(current);
		}
		System.out.println("............");
		
		while(it.hasPrevious()) {
			Integer x = it.previous();
			System.out.println(x);
		}
	}

}
