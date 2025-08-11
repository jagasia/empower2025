import java.io.FileWriter;
import java.io.IOException;

public class Task5 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("diary.txt");
		fw.write("Line 1");
		fw.write("Line 2");
		fw.write("Line 3");
		fw.flush();
		fw.close();
		
		
	}

}
