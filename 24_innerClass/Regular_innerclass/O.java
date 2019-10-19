class X
{
	int a = 10;
}

class O
{
	int a = 1111;
	class Y extends X
	{
		void abc(){
			System.out.println(a);//parent will resolve
		}
	
	}
	public static void main(String[] args){
		Y y = new O().new Y();
		y.abc();
	}
}