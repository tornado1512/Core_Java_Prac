class E//solution 
{
	int a = 12;

	void abc(){
		System.out.println("hello");
	}
	class X
	{
	}
	public static void main(String[] args){
		E e = new E();
		//System.out.println(e.a);
		//e.abc();
		X x = e.new X();
		System.out.println(x);

	}
}