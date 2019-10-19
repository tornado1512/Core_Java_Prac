class A
{
	A(){
		System.out.println(this);//object is created only once and of whose const is first call
	}
}
class B extends A
{
	B(){
		System.out.println(this);
	}
}
class M extends B
{
	public static void main(String [] args){
	M b = new M ();
	System.out.println(b);
	System.out.println("#############");
	M c= new M();
	System.out.println(c);
	}

}