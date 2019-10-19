class X{
	X(int y){}
}

class O extends X{
static int pro(){
	return 0;
}
O(){
	super(pro());
}
public static void main(String[] args){
	O o = new O();
}
}