package number;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) 
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				int n=sc.nextInt();
				int r;
				int sum=0;
				int temp=n;
				while(n>0)
				{
					r=n%10;
					sum=sum*10+r;
					n=n/10;
				}
				if(temp==sum)
				{
					System.out.println("is palindrom number");
				}
				else
				{
					System.out.println("is not palindrom number");
				}
	}

}
