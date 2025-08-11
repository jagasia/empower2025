import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputDemo {

	public static void main(String[] args) throws IOException {
		File f1=new File("harinath.dat");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f1));
		dos.writeInt(121);
		dos.writeFloat(2.5f);
		dos.writeBoolean(false);

		
		dos.flush();
		dos.close();
		System.out.println("Write operation is over");
	}

}
