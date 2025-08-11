import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task6 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\rjaga\\Pictures\\pendrive.jpg");
		FileInputStream fis=new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis);
		int data = -1;
		while((data=bis.read())!=-1) {
			System.out.println("Still there are "+bis.available()+" bytes to read");
			
		}
	}

}
