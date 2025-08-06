import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		
		char[] carr1 = str1.toLowerCase().toCharArray();
		char[] carr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(carr1);
		Arrays.sort(carr2);
		
		//convert char array into string
		
		String x=new String(carr1);
		String y=new String(carr2);
		
		if(x.equals(y)) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not anagrams");
		}
		
	}

}
