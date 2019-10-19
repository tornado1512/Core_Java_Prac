class A
{
	public static void main(String[] args){
		try
		{
			throw new Throwable();
		}
		catch (Object t)//object doesnt make  is-a  relationship with THROWABLE
		{
		}
	}
}