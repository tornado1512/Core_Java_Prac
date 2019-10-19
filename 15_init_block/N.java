class N
{	
	//case4
	static void pro(){
	System.out.println(a);
	}
	static int a= 20;
	public static void main(String[]args){
		N n = new N();
		n.pro();	
	}

	////////////////////////////////////
	/*
	//case3
	static {
	System.out.println("helloo");//if we are not refrencing any variale then it valid
	}
	static int a=20;
	*/
	////////////////////////////////////
	/*
	//case2
	static{
	System.out.println(a);//before using must declare it
	}
	static int a= 20;
	*/
	//////////////////////////////////
	/*
	//case1
	static int a = 20;
	static{
	System.out.println(a);
	}*/
}