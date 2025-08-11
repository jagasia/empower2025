import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadByteDemo {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\rjaga\\Pictures\\falooda.jpg");
		//to read all bytes
		FileInputStream fis=new FileInputStream(f1);
		int len = (int) f1.length();
		
		byte data[]=new byte[len];
		
		fis.read(data);

		System.out.println("All the bytes of the file is read now.");
		
		//i should write all these bytes to a new file
		
		FileOutputStream fos=new FileOutputStream("hrithik.jpg");
		fos.write(data);
		fos.flush();
		fos.close();
		System.out.println("Check the file now! hrithik.jpg");
	}

}
