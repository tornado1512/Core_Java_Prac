class B
{
	{
	System.out.println("hello"); // instance level init block run at time of everytime calling of constructor
	}
	public static void main(String[] args){
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		
	}
}