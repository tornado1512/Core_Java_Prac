class U
{
	public static void main(String []args){
			try
			{
				System.out.println("------------1");
				int i = 12/0;
				System.out.println("------------3");
			}
			catch (ArithmeticException e)
			{
				System.out.println(e.getMessage());
				System.out.println(e);
				e.printStackTrace();

			}
	}
}