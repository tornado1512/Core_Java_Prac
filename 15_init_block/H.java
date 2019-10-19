class X
{
	int a=12;
}

class H extends X
{
	int a=4;
	{
	int a = 89;
	System.out.println(a);
	System.out.println(this.a);
	System.out.println(super.a);
	}
	public static void main(String [] args){
			H h = new H();
	}

}