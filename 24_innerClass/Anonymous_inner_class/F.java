class X
{
	void abc (){
	
		}

}
class F
{
	X x = new X(){
	
		void abc(){
		System.out.println("hello");
		}
	};
	public static void main(String[] args){
		F f = new F();
		//x.abc();//non static variable cannot be referneced from static context
		f.x.abc();
	}
}