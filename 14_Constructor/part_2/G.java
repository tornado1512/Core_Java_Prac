class X
{
	private X(){
	
	}
	static X createObject(){
		X x = new X();
		return x;
		} 
}
class G
{
	 public static void main(String[] args){
		X t1 = X.createObject();
		X t2 = X.createObject();
		System.out.println(t1);
		System.out.println(t2);
	}
}