package b1;							//access of protected memeber through inheriatace as instance in diffeerent package is not valid 
import b1.b2.C;
class D extends C					//meber show() classA->classC->class D
{
public static void main(String[] args)
	{
     D d=new D();		//access as achild is valid
	  //C d=new C();
	  d.show();

}
}