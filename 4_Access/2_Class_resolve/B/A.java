class A										//when Class B is not found in same source code then compiler search B.java file in smae folder and if found then reat ists B.class file
{
	public static void main(String[] args)
	{
		B b=new B();
		System.out.println(b.x);
	}
}