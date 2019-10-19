class S2
{
	public static void main(String[] args){
		System.out.println("---------1");
		abc();
		System.out.println("---------2");
	}
	static void abc(){
		System.out.println("---------3");
		mno();
		System.out.println("---------4");
	}
	static void mno(){
		try{
			System.out.println("---------5");
			pqr();
			System.out.println("---------6");
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
	static void pqr (){
		System.out.println("---------7");
		int i = 12/0;
		System.out.println("---------8");
	}
}
//1-3-5-7-ae-4-2