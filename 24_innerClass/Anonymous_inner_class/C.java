interface X
{
	void abc();
}
class Y implements X
{
	public void abc(){
		System.out.println("hello");
	}
}
class C
{
	public static void main(String[] args){
		X x = new Y();
		x .abc();
	}
}