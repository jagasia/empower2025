import java.io.File;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		File file=new File("D:\\Jag\\Empower\\2025\\Notes\\Notes_08Aug2025.txt");
//		System.out.println(file.length());
		
		//when was it last accessed?
		
		long lm = file.lastModified();
		Date dt=new Date(lm);
		System.out.println(dt);
//		Date dt=new Date(0);
//		System.out.println(dt);
		
		
		
//		String[] list = file.list();
//		for(String x:list) {
//			System.out.println(x);
//		}
		
		/*
		 * File[] files = file.listFiles(); for(File f:files) { if(!f.isDirectory()) {
		 * System.out.println(f.getName()); } }
		 */
		
//		System.out.println("Mithun says \"Hello All\". And all are happy");
	}

}
