import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App3 {

	public static void main(String[] args) {
		List<Product> products=Arrays.asList(
				new Product(25L, "Pen", "Stationery", 20.0),
				new Product(14L, "Pencil", "Stationery", 10.0),
				new Product(53L, "Ridge guard", "Grocery", 25.0),
				new Product(45L, "Bitter guard", "Grocery", 18.0),
				new Product(55L, "Mango", "Fruits", 33.3),
				new Product(65L, "Grapes", "Fruits", 100.0)
				);
		
		products.stream()
		.map((t)->t.getName())
		.forEach(System.out::println);
	}

}
