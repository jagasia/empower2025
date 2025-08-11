import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputDemo {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("harinath.dat"));
		
		float f = dis.readFloat();
		int i = dis.readInt();
		boolean b = dis.readBoolean();
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(b);
	}

}
