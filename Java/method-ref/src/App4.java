
public class App4 {

	public static void main(String[] args) {
		PersonFactory pf=Person::new;
		Person p = pf.create("Alice");
		System.out.println(p);
	}

}
