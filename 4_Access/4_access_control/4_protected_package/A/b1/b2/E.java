package b1.b2;										//acceess of protected member through inheritnce in different package is valids
import a1.a2.A;
class E extends A
{
public static void main(String[] args)
	{
	E e=new E();
	e.show();
}
}