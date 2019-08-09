class X										//we can inherit class conatining final method also finall mthod can inherit but cannot be reimplemented
{
	final void show(){
	System.out.println("helloo");
	}
}
class H extends X
{   
	public static void main(String [] args){
	H h = new H();
	h.show();
}
}
