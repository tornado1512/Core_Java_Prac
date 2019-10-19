class A{
	int a;
}
class B extends A{
	int b;
}
class C extends B{
	int c;
}
class Y
{
	public static void main(String[] args){
		C d = new C();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
	}
}