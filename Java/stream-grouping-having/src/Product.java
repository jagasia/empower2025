import java.util.*;
import java.util.stream.*;
import java.util.Map.Entry;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
    
	@Deprecated
    public void method1() {
    	
    }
}