package a1.a2;							//accesss of protected member through imheritance package level is valid
class C extends A
{
	public static void main(String[] args)
	{
		C c=new C();
		c.show();
	}
}