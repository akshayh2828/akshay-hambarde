package inetrview;

public class Test
{
	public static void main(String[] args) 
	{
		Addresss add=new Addresss(12182, "santosh");
		System.out.println(add.pincode+add.city);
		Student std=new Student(1, "akshay", new Addresss(162516, "santosh"));
		System.out.println(std);
	}

}
