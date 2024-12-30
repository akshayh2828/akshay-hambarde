package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArrays {
	public static void main(String[] args) {
		//remove duplicate and sort the arrays
		List<Integer>ls=Arrays.asList(9,1,4,2,7,4,5,2,5,6);
	   List<Integer>ls1=ls.stream().distinct().sorted().collect(Collectors.toList());
	   System.out.println(ls1);
		
	}

}
