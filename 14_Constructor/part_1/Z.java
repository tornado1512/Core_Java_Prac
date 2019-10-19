class A
{
	A(float f){
	 System.out.println("A()");
	}
}
class Z extends A
{
	public static void main(String[] args){
		System.out.println("main() starts");
		Z z = new Z();
		System.out.println("main() ends");
	}
}
