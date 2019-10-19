class A
{
	int a = 30;
}
class B extends A
{ float f = 30.3f;
}
class L extends B
{
	int b;
	public static void main(String[] args){
		L l = new L();
	System.out.println(l.a);
	System.out.println(l.f);
	System.out.println(l.b);
	}
}