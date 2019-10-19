class Q
{
	public static void main(String[] args){
		
		try
		{
			int i = Integer.parseInt(args[0]);
			
			int [] ar = {22,33,43};
			
			System.out.println(ar[0]);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("oooooooopppppsssssssss");
		}
		String s = null;
		System.out.println(s.length());
	}
}