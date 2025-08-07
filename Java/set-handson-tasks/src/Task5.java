import java.util.TreeSet;

public class Task5 {

	public static void main(String[] args) {
		TreeSet<Integer> tree=new TreeSet<>();
		tree.add(62);
		tree.add(36);
		tree.add(610);
		tree.add(62);
		tree.add(56);
		tree.add(16);
		tree.add(62);
		tree.add(76);
		tree.add(62);
		tree.add(96);

		for(Integer x:tree) {
			System.out.println(x);
		}
		
	}

}
