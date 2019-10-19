class X
{
	static int a = 89;
}
class Y extends X
{
	static int a =556;
}
class D
{
	public static void main(String[] args){
		X x = new X ();
		System.out.println(x.a);
		Y y = new Y();
		System.out.println(y.a);
		X p = new Y ();
		System.out.println(p.a);
	}
}