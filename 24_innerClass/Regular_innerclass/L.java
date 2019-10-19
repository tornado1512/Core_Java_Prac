class L
{
	int i = 10;
	class X
	{
		void abc(){
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		L s1 = new L();
		L s2 = new L();
		s1.i=122;
		s2.i=345;
		X x1 = s1.new X();
		X x2 = s2.new X();

		x1.abc();
		x2.abc();
		System.out.println(s1);
		System.out.println(x1);
		System.out.println(s2);
		System.out.println(x2);
	}
}