abstract class X
{
X(){
	System.out.println("hello");
}
}
class S extends X
{
	S(){
	super();
	}
	public static void main(String [] args){
		//X x = new X();//abstract cannot be instantiated 
		//S s = new X();//abstract cannot be instantiated
		S s = new S();

	}

}