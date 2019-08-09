package b1.b2;			//acccess of protected member through instantiation in different package in not valid
import a1.a2.A;
class D
{
	public static void main(String[] args)
	{
		A a=new A();
		a.show();
	}
}