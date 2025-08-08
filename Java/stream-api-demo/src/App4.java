import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App4 {

	public static void main(String[] args) {
		List<Product> products=Arrays.asList(
				new Product(25L, "Pen", "Stationery", 20.0),
				new Product(14L, "Pencil", "Stationery", 10.0),
				new Product(53L, "Ridge guard", "Grocery", 25.0),
				new Product(45L, "Bitter guard", "Grocery", 18.0),
				new Product(55L, "Mango", "Fruits", 33.3),
				new Product(65L, "Grapes", "Fruits", 100.0)
				);

		//find category wise average price
		
		Map<String, Double> result = products.stream()
		.collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

		for(Entry<String, Double> e:result.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		
	}

}
