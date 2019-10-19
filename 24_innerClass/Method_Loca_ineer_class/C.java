class C
{
	void abc(){
	
		//case1
		//X x ;
		class X
		{
			void mno(){
				System.out.println("hello");
			}
		}
		//case2
		//X x ;
		//cas3
		X x = new X();
		x.mno();
		
	}

	public static void main(String[] args){
		C c = new C();
		c.abc();
	}
}