package map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreaaMap
{
	public static void main(String[] args) {
		TreeMap<String, Integer>tm=new TreeMap<String, Integer>();
		tm.put("santosh",1);
		tm.put("akshay",2);
	    System.out.println(tm);
        Integer[] array = {1, 2, 3, 4, 2, 3, 5, 6, 4};
        Set<Integer>ls=new HashSet<Integer>(Arrays.asList(array));
        System.out.println(ls);
        List<Integer>ls1=Arrays.stream(array).distinct().collect(Collectors.toList());
        System.out.println(ls1);
      

	}

	

}
