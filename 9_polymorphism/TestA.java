class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class TestA
{
	public static void main(String [] args){
		D d = new D();//here D() is-A type of class D
		C c = new D();//here D() is-A type of class C(immediate parent D)
		B b = new D();//here D() is-A type of class B(parent of D)
		A a = new D();//here D() is-A type of class A(parent of D)
		Object o = new D();//here D() is-A type of class Object(parent of D)
	
	}
}
