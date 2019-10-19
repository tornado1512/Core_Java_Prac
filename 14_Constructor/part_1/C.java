class C
{
	C(int y){//if we define consnt then compiler doent give default const
		System.out.println("hello");
	}
	public static void main(String[] args){
	//case2
	C c = new C(12);
	//case1
	//C c = new C();//here we have make const with arg and we are calling const with no args hence error
	
	}
}