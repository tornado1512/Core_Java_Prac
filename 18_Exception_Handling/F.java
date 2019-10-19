class F
{
	public static void main(String[] args){
		System.out.println(abc());		
	}
	static int abc(){
		try
		{
			return 12;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally{
			System.out.println("//////////finaly block");
			//finally block still runs before popout of method of return encountered
		}
		return 1222;
	}

}