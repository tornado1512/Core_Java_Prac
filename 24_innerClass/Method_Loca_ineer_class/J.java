class J
{
	void abc(){
		class X
		{
			private int a = 20;
		}
		X x = new X ();
		System.out.println(x.a);
	}
	public static void main(String[] args){
		J j = new J();
		j.abc();
	}
}