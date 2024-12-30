package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElemet {
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(1,31,2,3,4,5,62,45,13);
     	Optional<Integer>ls1=	ls.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst();
	    System.out.println(ls1.get());
	}

}
