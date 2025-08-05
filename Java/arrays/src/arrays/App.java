package arrays;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Integer []arr= {81,29,13,41,25,63,47};
		
		Arrays.sort(arr);

//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]);
//		}
		
		for(Integer x:arr) {
			System.out.println(x);
		}
	}

}
