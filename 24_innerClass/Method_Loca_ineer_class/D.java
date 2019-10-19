//access of instance level variable of outer class inside method inner class
class D
{
	int y = 10;
	void abc(){
		class X
		{	void mno(){
			System.out.println(y);
			}
		}
	X x = new X();
	x.mno();
	}
	public static void main(String[] args){
		D d1 = new D ();
		D d2 = new D ();
		d1.y=122;
		d2.y=12334;
		d1.abc();
		d2.abc();
	}
}