class X//accessing private var of outer class
{
	void abc(){
		System.out.println("hello");
	}
}
class G
{
	private int i = 10;
	X x = new X(){
		void abc(){
			System.out.println(i);
		}
	};
	public static void main(String[] args){
		G g = new G();
		g.x.abc();
	}
}