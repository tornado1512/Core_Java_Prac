class D
{
	static  int x=55;  //class level var 
	public static void main(String[] args) //class level method 
	{ 
		System.out.println(x);		//calling!!,x=context=class,x=class level var legal;
		D d=new D();
		System.out.println(d.x);    //calling!!, x=context=intance  x=clas level var legal; 
	}
}