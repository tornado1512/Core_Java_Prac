//case4
class L
{
	void pro(){
		System.out.println(s);
	}
	int s= 34;
	public static void main(String[] args){
		L l = new L();
		l.pro();
	} 
}

/*
//case3
class L
{
	{
	System.out.println("helloo");//here we are not using any varible hence it is legal
	}
	int s;
}
*/
/*
//case2
class L
{
	{
		System.out.println(s);//illegal forward refernce
	}
	int s= 0;
}

*/

/*cASE1
class L
{
	int i=4;
	{
	System.out.println(i);
	}
}*/