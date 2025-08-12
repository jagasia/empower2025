import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f=new File("abhishek");
		Product product=new Product(1L, "Pen", "Stationery", 15.0);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(product);
		oos.flush();
		oos.close();
		
	}

}
