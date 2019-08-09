 final class Z
{
	void show()
	{
		System.out.println("Show() of class Z");
	}
}
class W //extends Z							//we cannot inherit from a final class Z
{	
	/*void show(){
	System.out.println("Show() of class W");                      
	}*/
}
class D
{
	public static void main(String[] args){
		W w=new W();
		w.show();
	}
}