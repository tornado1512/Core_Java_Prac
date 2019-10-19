class A{
	int x=45; //instance level variable
	void pro()//intance level method
	{
	}
	public static void main(String[] args) //class level method 
	{  System.out.println(x);
		pro();                  //calling!!! type=no.  ,container type=class level,context=class illegal class context=intance leveln
	}
}