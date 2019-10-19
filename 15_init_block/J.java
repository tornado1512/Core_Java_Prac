class J
{
	{
	System.out.println("block A");
	}
	{
	System.out.println("block B");//top town approach and runs at time of calling of constructr
	}
	public static void main(String[] args){
		System.out.println("main start");
		J j = new J();
		System.out.println("main end");
	}
}