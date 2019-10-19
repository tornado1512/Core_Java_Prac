interface X
{
}

class Y implements X
{
	
}
class B
{
	public static void main(String[] args){
		//case1
		//X x ;
		//case2
		//X x = new X ();

		//case3
		X x = new Y();
	}
}