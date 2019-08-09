package a1.a2;
//case 7
import b1.b2.*;
import b1.b2.b3.*;
//case 6
//import b1.b2.B;
//case4
//import b1.b2.*;
//import b1.b2.b3.B; //preference is given to direct declaration whether it is declare first or later 
//case3
//import b1.b2.b3.*;
//import b1.b2.B;	 //preference is given to direct declaration whether it is declare first or later 
//case:2
//import b1.b2.B;	 //preference is given to direct declaration whether it is declare first or later 
//import b1.b2.b3.*;

//case:1
//import b1.b2.b3.B; //preference is given to direct declaration whether it is declare first or later 
//import b1.b2.*;
class A
{
	public static void main(String[] args){

		//case6
		B b=new B();
		b.show();
		//b1.b2.b3.B n=new b1.b2.b3.B();
		//n.show();
		//case 5
		//b1.b2.b3.B x=new b1.b2.b3.B();
		//x.show();
		//b1.b2.B y=new b1.b2.B();
		//y.show();
		//case:1,2,3,4,7
		//B b=new B();
		//b.show();
	}
}