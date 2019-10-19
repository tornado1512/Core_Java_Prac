class X
{
	X(int y){
	System.out.println("helloo");
	}
}
class N extends X
{
	int pro(){
	return 0;
	}
	N(){
		super(pro());//we cannot refernce a method before call of constructor
	
	}
	public static void main(String[] args){
			N n = new N();
	}
}