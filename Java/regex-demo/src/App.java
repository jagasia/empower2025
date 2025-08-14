import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//a mobile number should start with 6/7/8/9
		//and must be only numbers
		//10 digits only
		
//		String pattern="[6-9]\\d{9}";
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher matcher = p.matcher(input);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
