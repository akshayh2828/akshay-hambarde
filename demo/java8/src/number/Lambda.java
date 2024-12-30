package number;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class Lambda {
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(1,2,3,1,34,45,5,6,67,78,5,43,2);
	    ls.stream().filter(a->a%2==0).forEach(name->System.out.println(name));
	//System.out.println(ls1);
		
		
	}

}
