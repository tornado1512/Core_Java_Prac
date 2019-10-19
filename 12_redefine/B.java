class X
{
	static void pro(){
		System.out.println("pro() in X");
	}
}
class Y extends X
{
	static void pro(){
		System.out.println("pro()in Y");
	}
}
class B 
{
	public static void main(String[] args){
		//case3
		X x = new Y();
		x.pro();
		
		
		//case2
		//Y y = new Y();
		//y.pro();
		
		//case1
		//X x = new X();
		//x.pro();		//x interchange by X class name 
	}
}