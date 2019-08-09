package a1.a2;
public class A								//class A is public
{
	private void show()						//show is private
	{
		System.out.println("never give up");
	}
	public static void main(String[] args ){
		A a=new A();
		a.show();									//accesible only in same class
	}
}