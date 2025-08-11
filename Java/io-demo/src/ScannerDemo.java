import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("jag.txt");
//		f.createNewFile();
//		System.out.println(f.exists());
		
		Scanner sc=new Scanner(f);
		String input=sc.nextLine();
		
		System.out.println(input);
		input=sc.nextLine();
		System.out.println(input);
	}

}
