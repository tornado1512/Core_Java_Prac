class I
{
	private int i = 20;
	void abc(){
		class X
		{
			void mno(){
			System.out.println(i);
			}
		}
		X x = new X();
		x.mno();
		
	}
	public static void main(String[] args){
		I i = new I();
		i.abc();
		}
}