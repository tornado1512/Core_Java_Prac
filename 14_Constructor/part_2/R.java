//lazy technique for singleton class
class X
{
	static X x;
	static X getInstance(){//getInstance iss convention 
	if (x==null){
		x=new X();
	}
	return x;
	}
	private X(){}
}
class R
{
	public static void main(String [] args){
		X x1=X.getInstance();
		X x2=X.getInstance();
		System.out.println(x1);	
		System.out.println(x2);
	}
}