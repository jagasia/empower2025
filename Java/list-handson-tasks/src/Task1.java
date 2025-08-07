import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Sachin");
		list.add("Arjun");
		list.add("Jadeja");
		list.add("Robin");
		list.add("Kapil");
		
		list.remove("Jadeja");
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
