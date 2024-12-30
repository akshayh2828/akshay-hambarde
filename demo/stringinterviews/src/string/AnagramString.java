package string;

import java.util.Arrays;

public class AnagramString 
{
	public static boolean IsAnagramProgram(String str1,String str2)
	{
		char[] ch1=str1.toCharArray();
		char [] ch2=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(str1.length()!=str2.length())
		{
			return false;
		}
		return Arrays.equals(ch1, ch2);
	}

	public static void main(String[] args) {
		String s1="hearth";
		String s2="earth";
		if(IsAnagramProgram(s1, s2))
		{
			System.out.println("is anagram");
		}
		else
		{
			System.out.println("is not anagram");
		}
//	   System.out.println(IsAnagramProgram(s1, s2));
		
	}
}
