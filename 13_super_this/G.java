class G
{
	int a = 33;
	void pro(){
	int  a = 23;
		System.out.println(a);
		System.out.println(this);
		System.out.println(this.a);
	}
	public static void main(String[] args){
		G g = new G(); System.out.println(g);
		g.pro();
		G g2 = new G();
		g2.a=56;
		g2.pro();
	}
}