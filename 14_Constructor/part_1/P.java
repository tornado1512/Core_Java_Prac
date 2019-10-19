class P
{
	P(){
	//super();
	}
	P(int p){
	this();//we use this() for calling cons of same classs when cons is overloaded
	}
	public static void main(String[] args){
		P p = new P();
	}
}