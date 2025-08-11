import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task8 {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.bin"));
		dos.writeInt(123);
		dos.writeDouble(1.2);
		dos.writeUTF("This is a string");
		dos.flush();
		dos.close();
		
		DataInputStream dis=new DataInputStream(new FileInputStream("data.bin"));
		int i=dis.readInt();
		double d=dis.readDouble();
		String s=dis.readUTF();
		System.out.printf("%d\t%.1f\t%s\n",i,d,s);
	}

}
