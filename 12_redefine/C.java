class X
{
	int a = 89;
}
class Y extends X
{
	int a = 99;
}
class C
{
	public static void main(String[] args){
			//case3
			X x = new Y();
			System.out.println(x.a);
			
			//case2
			//Y y = new Y();
			//System.out.println(y.a);

			//case1
			//X x = new X();
			//System.out.println(x.a);
			
	}
}