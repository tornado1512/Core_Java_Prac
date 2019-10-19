class E
{
	static class X
	{
		private int a = 10;//non static private var of nested class is acceble to outer class
	}
	public static void main(String[] args){
		X x = new X();
		System.out.println(x.a);
	}
}