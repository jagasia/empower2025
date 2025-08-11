import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOneByteDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f1=new File("C:\\Users\\rjaga\\Pictures\\iphone-14-pro-.jpg");
		FileInputStream fis=new FileInputStream(f1);
		FileOutputStream fos=new FileOutputStream("Atharv.jpg");
		int data=-1;
		while((data=fis.read())!=-1) {
			fos.write(data);
			Thread.sleep(100);
			fos.flush();
		}
		fos.close();
		System.out.println("Done");
	}

}
