package b1.b2;							//default  memeber is not accesible in different package through inheritance	
import a1.a2.A;
class E extends A
{
public static void main(String[] args)
	{
	E e=new E();
	e.show();
}
}