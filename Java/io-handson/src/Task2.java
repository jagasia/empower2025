import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		File f=new File("notes.txt");
		FileInputStream fis=new FileInputStream(f);
		int data=-1;
		while((data=fis.read())!=-1) {
			System.out.print((char)data);
		}
		fis.close();
	}

}
