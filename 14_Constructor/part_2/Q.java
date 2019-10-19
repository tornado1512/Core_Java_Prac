//singleton class

class X
{
	static X x = new X();
	private X(){
		
	} 
	static X getInstance(){
		return x;
	}
	
}

class Q
{
	public static void main(String[] args){
		X i = X.getInstance();
		X o= X.getInstance();
		System.out.println(i);
		System.out.println(o);

	}
}