class F
{
	int a = 10;
	void abc(){
		X x = new X();
		x.mno();
	}
	static class X
	{
		void mno(){
			F f = new F();// doubt we call here instance var
			System.out.println(f.a);
		}
	}
	public static void main(String[] args){
		F f = new F();
		f.abc();
	}
}