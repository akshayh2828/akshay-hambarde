package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement 

{
	public static void main(String[] args) {
		List<Integer>ls=Arrays.asList(1,2,3,4,5,1,2,3,6,6,7,8);
		List<Integer>ls1=ls.stream().distinct().collect(Collectors.toList());
		System.out.println(ls1);
		String str="india is my country";
		int count=0;
		String[] str1=str.split("\s+");
		int count1=str1.length;
		System.out.println(count1);
		for(int i=0;i<str.length();i++)
		{
			count++;
		}
		System.out.println(count);
		Long str2=str.chars().count();
		System.out.println(str2);
		
		String s1=new String("ram");
		String s2=new String("ram");
		String s3="ram";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		
		
		
	
	}

}
