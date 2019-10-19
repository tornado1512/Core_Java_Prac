class X
{
	static int a = 90;
}
class Y extends X
{
	static int a = 34;
	void pro(){
	int a = 55;
	System.out.println(a);
	System.out.println(this.a);				//for static varible at calling this is replace by class name 
	System.out.println(super.a);			//for static varible at calling super is replace by parent class name 
	}
}
class D
{
	public static void main(String[] args){
		Y y = new Y();
		y.pro();
	}
}