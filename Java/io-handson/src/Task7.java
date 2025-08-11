import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task7 {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("source.pdf"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.pdf"));
		
		byte []data=new byte[1024];
		while(true) {
			data=bis.readNBytes(1024);
			if(data==null) {
				break;
			}
			bos.write(data);
			bos.flush();
		}
		bos.close();
		bis.close();
		
		
	}

}
