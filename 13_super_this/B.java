class X
{
	int a=43;
}
class Y extends X
{
	int a=90;
	void pro(){
	int a = 22;
	System.out.println(a);//for local variable of pro()
	System.out.println(this.a);//for instance var of class Y
	System.out.println(super.a);//for instance of X(parent)
	}
}
class B
{
	public static void main(String[] args){
		Y y = new Y();
		y.pro();
	}
}