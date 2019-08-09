package b1.b2;								//default memeber is not accesisble diiferent pacakage through intantiation  
import a1.a2.A;
class D
{
	public static void main(String[] args)
	{
		A a=new A();
		a.show();
	}
}