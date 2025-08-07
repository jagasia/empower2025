import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Character, Integer> map=new LinkedHashMap<>();
		String input=sc.nextLine();
		for(int i=0;i<input.length();i++) {
			Character c=input.charAt(i);
			//if this character is already found or not?
				//found? update the value
				//not found? add new entry
			
//			Integer count = map.get(c);
//			if(count==null) {
//				count=0;
//			}
//			count++;
//			map.put(c, count);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
//		//print the output
//		for(Entry<Character, Integer> entry:map.entrySet())
//		{
//			System.out.println(entry.getKey()+"\t"+entry.getValue());
//		}
		
		Set<Character> keys = map.keySet();
//		for(Character key:keys) {
//			System.out.println(key+"\t"+map.get(key));
//		}
		
		Iterator<Character> it = keys.iterator();
		
		while(it.hasNext()) {
			Character key = it.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
	}

}
