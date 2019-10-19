class S
{
	int a  = 9;
	class A
	{int a = 10;
		class B
		{
			int a = 11;
			class C
			{
				int a = 12;
				void abc(){
					System.out.println(a);
					System.out.println(this.a);
					System.out.println(A.this.a);
					System.out.println(B.this.a);
					System.out.println(C.this.a);
					//System.out.println(X.this.a);
				}
			}
		}
	}
	public static void main(String[] args){
		/*
		S s = new S();
		A a = s.new A();
		B b = a.new B();
		C c = b.new C();
		*/
		X x = new X();
		X.A a = x.new A();
		X.A.B b= a.new B();
		X.A.B.C c = b.new C();
		c.abc();
	}

}
//case1
/*
class S
{
	public static void main(String[] args){
		X x = new X();
		X.A a = x.new A();
		X.A.B b= a.new B();
		X.A.B.C c = b.new C();
		c.abc();
	}
}*/