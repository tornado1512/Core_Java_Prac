interface X
{
	int a = 88;
}
interface Y
{
	int a= 66;

}
class E implements X,Y
{
	int a = 90;
	void pro(){
	System.out.println(a);
	System.out.println(X.a);
	System.out.println(Y.a);
	}
	public static void main(String [] args){
		E e = new E();
		e.pro();
	}	
}
