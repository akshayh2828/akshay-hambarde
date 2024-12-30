package arrays;

import java.util.Arrays;
import java.util.List;

public class CountNumberOfElementInString {
	public static void main(String[] args) {
		List<String>str=Arrays.asList("apple","banana","mango","apple","pineapple","apple");
		Long count=str.stream().filter(e->e.equals("apple")).count();
		System.out.println(count);
	}

}
