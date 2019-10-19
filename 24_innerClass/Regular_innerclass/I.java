class X
{
	class Y
	{
	}
}
class I
{
	public static void main(String[] args){
		X x = new X();
		X.Y y = x.new Y();
		System.out.println(y);
	}
}