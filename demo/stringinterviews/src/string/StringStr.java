package string;

public class StringStr 
{
	public static void main(String[] args) 
	{
		String str="akshay";
		str="santosh";
		String str2=new String(str);
		System.out.println(str2);
		str2="akshay";
		System.out.println(str2);
		System.out.println(str.hashCode());
		StringBuffer sb=new StringBuffer(str);
		//sSystem.out.println(sb);
		System.out.println(sb.hashCode());
		String str3="asif";
		System.out.println(str.hashCode());
		String str4=str+str3;
		System.out.println(str4);
		System.out.println(str4.hashCode());
	}

}
