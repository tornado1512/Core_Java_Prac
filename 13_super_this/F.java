class F
{
	int a = 322;
	void pro(){
		//System.out.println(f);
		System.out.println(this);//we use this for current object
		System.out.println(a);

	}
	public static void main(String[] args){
		F f = new F();
		System.out.println(f);
		f.pro();
	}
}