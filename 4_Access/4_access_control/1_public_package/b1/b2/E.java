package b1.b2;								//public memeber is accesible in different package through instantiation
import a1.a2.A;
class E extends A
{
	public static void main(String[] args)
	{
	E d=new E();
	d.show();
	}
}