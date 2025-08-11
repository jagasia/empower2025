import java.io.FileReader;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("story.txt");
		int data='\0';
		int countVowel=0;
		while((data=fr.read())!=-1) {
			char c=(char) data;
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				countVowel++;
			}
			
		}
		System.out.println(countVowel);
	}

}
