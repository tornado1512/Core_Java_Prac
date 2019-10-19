class X
{
	static {
	System.out.println("init of X");
	}
	X(){
	System.out.println("COnst of X");
	}
}
class G extends X
{
	static {
	System.out.println("init of G");
	}
	G(){
	System.out.println("cosnt of G");
	}
	static {
	System.out.println("init of X");
	}
	public static void main(String[] args){
		System.out.println("main starts...........");
		G g = new G();
		System.out.println("main ends.............");


	}
}