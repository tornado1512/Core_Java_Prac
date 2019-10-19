class X
{
	static void pro(H p){
		System.out.println(p);
		System.out.println(p.a);
	}
}
class H extends X
{
	int a ;
	void show(){
		a=22;
		System.out.println(a);
		System.out.println(this);
		pro(this);
	}
	public static void main(String [] args){
		H x = new H ();
		System.out.println(x.a);
		System.out.println(x);
		x.show();
	}
}
