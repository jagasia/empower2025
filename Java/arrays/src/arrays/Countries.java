package arrays;

import java.util.Scanner;

public class Countries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfCountries=sc.nextInt();
		String []arr=new String[noOfCountries];
		for(int i=0;i<noOfCountries;i++) {
			arr[i]=sc.nextLine();
			if(arr[i].equals("")) {
				arr[i]=sc.nextLine();
			}
		}
		
		//display all countries
		
		for(String x:arr) {
			System.out.println(x);
		}
	}

}
