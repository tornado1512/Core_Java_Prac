class X
{
	void pro(){
	System.out.println("pro in A");
	}
}
class Y extends X
{
	void pro(){
	System.out.println("pro in B");
	}
}
class A
{
	public static void main(String[] args){
		//case3
		X a = new Y();		//dynamic mehtod dispatch object ref code decide whose objr=ect is to run
		a.pro();
		//case2
		//Y a = new Y();
		//a.pro();			//dynamic mehtod dispatch object ref code decide whose objr=ect is to run


		//case1
		//X a = new X();
		//a.pro();			//dynamic mehtod dispatch object ref code decide whose objr=ect is to run
	}
}