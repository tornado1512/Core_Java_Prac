package a1.a2;//importing through * doesnt allow to acess class inside folder 
//case:1
//import b1.b2.b3.*;
//case:2
//import b1.b2.*;
//case:3
import b1.*;

class A
{
	public static void main(String[] args){ 
	//class B is preset att b3
		B b=new B();  
	//class C is present inside b2
			C c=new C();
	//class D is present inside b1
				D d=new D();							
	}
}