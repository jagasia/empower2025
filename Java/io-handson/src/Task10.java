import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Task10 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		CharBuffer cb=CharBuffer.allocate(100);
		isr.read(cb);
		String str = cb.toString();
		System.out.println(str);
	}

}
