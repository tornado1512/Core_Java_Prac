class E
{
	E(){
	System.out.println("E()");
	}
	E(float f)
	{
	this();
	System.out.println("E(float f )");
	}
}
class S extends E
{
	S(){
		this(13);
		System.out.println("S()");
	}
	S(int r){
	super(2.4f);
	System.out.println("S(int r)");
	}
	public static void main(String[] args){
			S s = new S(13);
			System.out.println("inside main()");
	}
}