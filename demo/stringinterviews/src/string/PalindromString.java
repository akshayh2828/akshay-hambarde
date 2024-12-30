package string;

public class PalindromString {
	public static void main(String[] args) {
		String str="aka";
		String str1="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		if(str.equals(str1))
		{
			System.out.println("is palindrom number");
		}
		else
		{
			System.out.println("is not palindrom number");
		}
		
		
	}

}
