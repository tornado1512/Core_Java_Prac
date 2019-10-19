class F
{
	int a=10;
	void abc(){
		System.out.println(a);
		//case1
		

		//X x = new X();
		//System.out.println(x);
		//or
		//X x = this.new X();

	}
	class X
	{
	}
	
	public static void main(String[] args){
		F f= new F();
		//f.abc();

		//case3
			
		Y y = f.new Y();

	}
}