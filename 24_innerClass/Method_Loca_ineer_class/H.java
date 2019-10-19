class H extends Z
{
	//int y = 20;//5
	void abc(){
		//int y = 22;//4
	class X extends Y
	{ //int y = 24;//2
		void mno(){
			//int y = 20;//1	
			
			System.out.println(y);
		}
	}
	X x = new X ();
	x.mno();
	}
	public static void main(String[] args){
		H h = new H();
		h.abc();
	}
}
class Z
{
	int y =10;
}
class Y
{ //int y = 30;//3
}