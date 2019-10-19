class M
{	private int i= 10;
	class X
	{
			void abc(){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		X x = new M().new X();
		x.abc();
	}
}