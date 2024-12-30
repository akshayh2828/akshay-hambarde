package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrays {
	public static void main(String[] args) {
		List<Integer>ls1=Arrays.asList(1,2,3,4,5);
		List<Integer>ls2=Arrays.asList(6,7,8,9,10);
	    List<Integer>mergeTwoArryas=Stream.concat(ls1.stream(), ls2.stream()).collect(Collectors.toList());
	    System.out.println(mergeTwoArryas);
		
	}

}
