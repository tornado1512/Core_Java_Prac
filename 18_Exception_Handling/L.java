class L
{
	static {
		//exceptionIninitaializerError
		try
		{
			throw new ArithmeticException();
		}
		catch (Exception e)
		{	
			e.printStackTrace();
		}
		//throw new ArithmeticException();
		//int a= 12/0;
	}
	public static void main(String[] args){
		
	}
}