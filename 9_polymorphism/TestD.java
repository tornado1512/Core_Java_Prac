class A
{
}
class B extends A
{
}
class TestD
{
	public static void main(String[] args){
		//casae2
		B b = new A(); //A is-A type of class B(incporect)
		//case1
		A a = new B(); //B is-A type of A(correct)
		}
}