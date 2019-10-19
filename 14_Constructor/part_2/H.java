class X
{
	X(){
	
	}

	X(int y){
	this();
	}
}
class H
{
	public static void main(String[] args){
			X x = new X(12);
	}
}