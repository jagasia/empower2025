import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		books.add(new Book(14, "You can win", 105.0));
		books.add(new Book(5, "Tale of two cities", 80.0));
		books.add(new Book(1, "Wings of Fire", 115.0));
		books.add(new Book(2, "Let us C", 100.0));
		books.add(new Book(4, "Java Complete Reference", 125.0));
		
		
		Collections.sort(books);
		
		for(Book b:books) {
			System.out.println(b);
		}
	}

}
