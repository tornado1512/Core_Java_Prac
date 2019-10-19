class F
{	//int a =10;
	//static int a = 10;
	static void abc(){
	
		class X
		{
			void pqr(){ //why pqr cannot be mark as static
				System.out.println(a);
			}
		}
		X x = new X ();
		x .pqr();
	}
	public static void main(String[] args){
		abc();
	}
}