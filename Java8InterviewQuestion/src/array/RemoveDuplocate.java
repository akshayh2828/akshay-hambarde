package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplocate {

	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(12,2,2,3,4,3,2,1,4,5,5,7,5);
		
	    List<Integer>ls1=ls.stream().distinct().collect(Collectors.toList());
	    System.out.println(ls1);
	}

}
