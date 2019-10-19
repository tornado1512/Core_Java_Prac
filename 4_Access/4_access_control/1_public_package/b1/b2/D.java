package b1.b2;				//public memeber is accesible in different package through instantiation
import a1.a2.A;
class D
{
	public static void main(String[] args){
	A a=new A();
	a.show();
	}
}