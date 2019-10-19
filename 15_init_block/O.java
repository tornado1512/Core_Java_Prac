class O
{
	{
	System.out.println(this);
	}
	O(){
	System.out.println(this);
	}
	static {
	//System.out.println(this);//non static variable connot reference from a static context
	}
	void pro(){
	System.out.println(this);
	}

	static void pro2(){
	System.out.println(this);
	}

}