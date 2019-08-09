class B{
	static int x=43;//class level var
	static void show()//class level method
	{
		System.out.println("helloo");
}
public static void main(String [] args)        //class level method
	{
		System.out.println(x);                    //calling!!!!! x is class level context=class legal
		show();                                        //calling!!!!! pro is class level context=class legal
}
}