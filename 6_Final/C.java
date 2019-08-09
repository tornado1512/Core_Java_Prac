final class X
{
		int x=90;
}
class C 
{
	public static void main(String [] args){
		X c = new X();
		c.x=65;								//we can modify the memeber variable of a final class
		System.out.println(c.x);

	}
}