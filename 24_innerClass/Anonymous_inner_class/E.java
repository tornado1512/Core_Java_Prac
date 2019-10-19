abstract class X
{
	abstract void abc();
}
class E
{
	public static void main(String [] args){
		X x = new X(){
			int y = 20;
			void abc(){
			System.out.println("helloo");
			}
			void mno(){
			System.out.println("heiiiiiii");
			}
		
		};
		x.abc();
		//x.mno();//we cannot make var or method in any anonymous
		//System.out.println(y);
	}
}