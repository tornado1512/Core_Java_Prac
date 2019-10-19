//how to access Class class Object

class A
{
	public static void main(String[] args){
		//case3
		

		//casse2
		A a = new A();
		Class y = a.getClass();
		System.out.println(y);
		
		//case1
		Class x = A.class;
		System.out.println(x);
	}
}