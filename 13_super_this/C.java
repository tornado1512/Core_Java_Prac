class X
{
	static void pro(){
		System.out.println("pro in X");
	}
}
class Y extends X
{
	static void pro(){
		System.out.println("pro in Y");
	}
	void abc(){
		pro();								//
		this.pro();
		super.pro();
	}
}

class C
{
	public static void main(String [] args){
		Y y = new Y();
		y.abc();
	}

}