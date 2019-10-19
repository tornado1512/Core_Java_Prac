class R
{
	R(){
		//this(4);
	System.out.println("R()");	
	}
	R(int y){
		this();
	System.out.println("R(int y)");
	}
	public static void main(String[] args){
		R r = new R(3);
	}
}