package arrays;

import java.util.Arrays;

public class MaxAndMinArray {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8};
		int max=Arrays.stream(arr).max().getAsInt();
		int min=Arrays.stream(arr).min().getAsInt();
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
