class X//calling using class name wrong context
{
	int a= 12;
	void abc(){
	
	}
	class Y
	{
	}
}
class G
{
	public static void main(String[] args){
		
		//case3
		
		//X. new Y(); //wrong error
		//X.Y y = X.new Y();
		X.Y y = X.new Y();
		//Y y = new Y();

		//case2
		//abc();
		//X.abc();

		//case1
		//System.out.println(X.a);
		//System.outprintln(a);

	}
}