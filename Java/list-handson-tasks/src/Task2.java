import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(15,42,33,42,15,96,78,78,96,50);
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("Printing all even numbers:");
		for(Integer x:list)
		{
			sum+=x;
			if(x>max) {
				max=x;
			}
			if(x<min) {
				min=x;
			}
			if(x%2==0) {
				System.out.println(x);
			}else
			{
				x=0;
			}
		}
		
		System.out.println("Sum of all numbers:"+sum);
		System.out.printf("Max is %d and min is %d",max,min);
		
	}

}
