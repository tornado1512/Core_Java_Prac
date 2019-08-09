package a1.a2;

/*
//case 1
import b1.b2.B;							// package separately one by one
import b1.b2.C;
import b1.b2.D;
*/
//case 2
import b1.b2.*;							//combine importing by using *

class A

{
	public static void main(String[] args)
	{
	B x =new B();
	C q =new C();
	D w =new D();
	System.out.println(x.b+""+q.c+""+w.d);
	}
}