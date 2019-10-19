class T
{
	public static void main(String[] args){
		System.out.println("---------1");
		A.abc();
		System.out.println("---------2");
	}
}
class A
{
	static void abc(){
		System.out.println("---------3");
		B.mno();
		System.out.println("----------4");
	}
}
class B
{
	static void mno(){
		System.out.println("---------5");
		C.pqr();
		System.out.println("----------6");
	}
}
class C
{
	static void pqr(){
		System.out.println("---------7");
		
		int i = 12/0;
				
		System.out.println("----------9");
	}
}

