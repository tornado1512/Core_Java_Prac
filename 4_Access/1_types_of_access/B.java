class Test
{
	public static void main(String[] args)
	{
	Test t=new Test();						//errror
	t.show();								//does not found show method because no intantiation is created and no class is inherited
	}										//no inheritance is present and class T doesnt have any parent class 
}
class B
{
	void show()
	{ System.out.println("helooooo");
	}
}