class X
{
	private X(){
	
	}
	//case3
static	X createObject(){
	X x = new X();
	return x;
	}
	//case2
	/*X createObject(){
	X x = new X();
	return x;
	}*/
}
class F
{   
	public static void main(String[] args){
	//case3
	X p = X.createObject();
	//case2
	//X p = createObject();
	//case1
	//X x = new X();
	/*private F(){}
	
			F f = new F();
	*/
	}
}