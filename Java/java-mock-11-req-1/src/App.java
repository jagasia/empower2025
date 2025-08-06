import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college 1 detail:");
		String str1=sc.nextLine();
		System.out.println("Enter college 2 detail:");
		String str2=sc.nextLine();
		
//		IIT Madras,www.iitm.ac.in,7845612390,iit,16,Madras,15-12-1959
		String[] arr1 = str1.split(",");
		College college1=new College();
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumerOfDept(Integer.valueOf(arr1[4]));
		college1.setLocation(arr1[5]);
		//String into java.util.Date
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date startingDate = sdf.parse(arr1[6]);
		college1.setStartingDate(startingDate);
		
		
		String[] arr2 = str2.split(",");
//	String name, String website, String mobile, String founder, Integer numerOfDept, String location,Date startingDate
		College college2=new College(arr2[0],arr2[1],arr2[2],arr2[3],Integer.valueOf(arr2[4]),arr2[5],sdf.parse(arr2[6]));
		
		System.out.println("College 1:");
		System.out.println(college1); 		//syso automatically calls .toString method
		
		System.out.println("College 2:");
		System.out.println(college2);
		
		if(college1.equals(college2))
		{
			System.out.println("College 1 is same as College 2");
		}else
		{
			System.out.println("Collge 1 and College 2 are different");
		}
	}

}
