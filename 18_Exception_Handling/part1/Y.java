import java.io.*;

class Y
{
	public static void main(String[] args){
		try
		{	
			//case2
			//throw new Y();//Y() cannot be converted to Throwable 
			throw new LowBalanceException ();//only those objects can be throw whose class lies in inheritane tree of throwable


			//case1
			//throw new ActivationException();//doubt
			//throw new AbsentInformationException();//doubt
			//throw new Throwable(); 
			//throw new Exception();
			//throw new FileNotFoundException();//doubt
			//throw new NullPointerException();
			//throw new ArithmeticException();//we can write only one throw at a time			
		}
		catch (Throwable e )
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
class LowBalanceException
{
}