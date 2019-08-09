class A										//here compiler first check in the same source code then creat B.class fille
{
	public static void main(String[] args)
	{
		B b=new B();
		System.out.println(b.x);
	}
}
class B
{
	int x=22;
}