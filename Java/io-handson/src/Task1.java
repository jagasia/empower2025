import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {

	public static void main(String[] args) throws IOException {
		File dir=new File("d:\\jag");
		if(dir.exists()) {
			//display all files
			File[] files = dir.listFiles();
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
			for(File f:files) {
				if(f.isFile()) {
					String name = f.getName();
					long size = f.length();
					long lm = f.lastModified();
					
					System.out.printf("**%s**%d**%s**\n",name, size, sdf.format(new Date(lm)));
				}
			}
		}else {
			dir.createNewFile();	//create if not exists
		}
	}

}
