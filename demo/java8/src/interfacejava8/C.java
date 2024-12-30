package interfacejava8;

public class C implements A,B
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		A.super.display();
		B.super.display();
	}
		

}

