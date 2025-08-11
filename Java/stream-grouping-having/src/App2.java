import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App2 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Pen", "Stationery", 20.0),
            new Product("Pencil", "Stationery", 10.0),
            new Product("Notebook", "Stationery", 80.0),
            new Product("Mango", "Fruits", 50.0),
            new Product("Grapes", "Fruits", 60.0),
            new Product("Apple", "Fruits", 40.0)
        );

        // TODO: Group by category, sum price, and filter categories with total > 100
        Map<Object, Double> result = products.stream()
        .collect(Collectors.groupingBy((t)->t.category, Collectors.summingDouble((t)->t.price)));;
 
        result=result.entrySet().stream()
        .filter((t)->t.getValue()>120)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        
        for(Entry<Object, Double> e:result.entrySet()) {
        	System.out.println(e);
        }
        
    }
}