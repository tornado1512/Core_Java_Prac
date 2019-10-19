class G
{
	static void abc(){
		int y = 10;

		class X
		{
			void pqr(){
				System.out.println(y);

		}
	}
		X x = new X();
		x.pqr();
	}
	public static void main(String [] args){
		abc();
	}
}