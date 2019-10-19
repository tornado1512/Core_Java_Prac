class X
{
	int a= 12;
	void abc(){
		System.out.println("hello");
	}
	class Y
	{
	}
}
class H
{
	public static void main(String[] args){
		X x = new X ();
		//case4
		//Y y = new Y();
		//X.Y y = X.new Y();
		X.Y y = x.new Y();

		//case3
		//new Y();
		//X.new Y();
		//x.new Y();

		
		//case2
		//abc();
		//X.abc();
		//x.abc();
		//case1

		//System.out.println(x.a);
		//System.out.println(X.a);
		//System.out.println(a);

	}
}