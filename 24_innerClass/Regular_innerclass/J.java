class X
{
	int s = 10;
	 static  int s1= 111;

}

class J
{
	public static void main(String[] args){
		
		//case2
		System.out.println(new X().s);//if we have to access var of one class into another different class then this can be done by using class name or obj ref var
		System.out.println(X.s1);

		//case1
		//System.out.println(s);
		//System.out.println(s1);

	}
}