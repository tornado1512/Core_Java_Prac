class X{
	X(int y){
		System.out.println(y);
	}
}
class M extends X
{
	static int m = 2;
	M(){
	super(2);
	}	
	public static void main(String [] args){
		M m = new M();
	}
}
