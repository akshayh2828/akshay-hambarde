package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestSalary {
	public static void main(String[] args) 
	{
		List<Integer>ls=Arrays.asList(50000,67392,856382,8736384,8563583,974528,40000,45000);
	    List<Integer>ls1=ls.stream().filter(e->e>50000).collect(Collectors.toList());
	    System.out.println(ls1);
	}

}
