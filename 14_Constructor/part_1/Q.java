//case3
class Q
{
	Q(boolean b){
	
	}
	Q(){
	super(); this(true);//not allowed
	}
}

/*
//case2
class Q
{
	Q(boolean a){
	
	}
	Q(){
		this(true);
		super();//super must be first statement
	}
}
*/
/*
//case1
class Q
{
	Q(boolean a){
	
	}
	Q(){
	super();
	this(true);//this must be first statement
	}
}
*/