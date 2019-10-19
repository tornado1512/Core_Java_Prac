import java.io.*;

class X
{
	X()throws FileNotFoundException{
		FileReader f = new FileReader("abc.txt");
	}
}
class D extends X
{
	
	D()throws FileNotFoundException{
		super();
	}


/*
	D(){
	try
	{
		super();//super mus be first statement hence only solution is to be declare 
	}
	catch (Throwable e)
	{
	}
	}
	*/


	/*
	D(){
		//error in default constructor when super call to parent const having checked const-unreported exception.............
		super();
	}*/
	public static void main(String[] args)throws FileNotFoundException{
		D d = new D();
	}
}