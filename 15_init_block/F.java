class X
{
	{
	System.out.println("init of X");
	}
	X(){
	System.out.println("cnst of X");
	}
}
class F extends X
{
	{
	System.out.println("init of F");
	}
	F(){
	System.out.println("const of X");
	}
	public static void main(String [] args){
	System.out.println("main starts.........");
	F f = new F();
	System.out.println("main ends........");
		
	}
}