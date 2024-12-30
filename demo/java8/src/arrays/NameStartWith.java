package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartWith {
	public static void main(String[] args) {
		List<List<String>> str=Arrays.asList(
				Arrays.asList("akshay","santosh"),
				Arrays.asList("akhilesh","nikhil"),
				Arrays.asList("dhiraj","aditya"));
	List<String>str1=str.stream().flatMap(List::stream).filter(name->name.startsWith("a")).collect(Collectors.toList());
	str1.forEach(System.out::println);
	}

}
