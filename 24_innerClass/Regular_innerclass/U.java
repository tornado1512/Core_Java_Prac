class X
{
	private class U
	{
	}
}
class U
{
	public static void main(String[] args){
		X.U u = new X().new U();
	}
}