class K{

	int i = 10;
	class X
	{
		void abc(){
			System.out.println(i);
		}
	}
	void mno(){
		System.out.println(i);
	}

	public static void main(String[] args){
		new K().new X().abc();
		
		//case1
		/*
		K k = new K();
		X x = k.new X();
		x.abc();
		*/

	}
}