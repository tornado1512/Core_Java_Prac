interface X{
	int i=90;
}
class L implements X 
{
	void show(){
	//System.out.println(i);
	int i=78;
	System.out.println(i);
	}
	public static void main(String[] args){
	L l = new L();
	l.show();
	}
}