class H
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
		System.out.println("---------1");
		return 111;
	}
}