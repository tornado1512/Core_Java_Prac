class N
{

	void abc(){
		X o = new X();
		System.out.println(o.i);
	}
	class X
	{
		private int i = 10;
	}
	public static void main(String [] args){
		new N().abc();	
	}
}