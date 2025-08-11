import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
//		FileWriter fw=new FileWriter("output.txt");
//		fw.write(input);
//		fw.flush();
//		fw.close();
//		
		
		FileOutputStream fos=new FileOutputStream("output.txt");
		fos.write(input.getBytes());
		fos.flush();
		fos.close();
	}

}
