class D
{
	//int a = 10;
	private static int a = 10;//static and private var of outer class accessible
	 static class X
	{
		void abc(){
			System.out.println(a);
		}
	}
	public static void main(String[] args){
		X x = new X();
		x.abc();
	}
}