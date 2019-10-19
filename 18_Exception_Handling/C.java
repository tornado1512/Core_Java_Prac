import java.io.*;

class C
{
	public static void main(String[] args)throws FileNotFoundException{
		System.out.println("--------1");
		abc();
		System.out.println("--------2");
	}
	static void abc()throws FileNotFoundException{
		System.out.println("--------3");
		mno();
		System.out.println("--------4");
	
	}
	static void mno()throws FileNotFoundException{
		System.out.println("--------5");
		pqr();
		System.out.println("--------6");
	}
	static void pqr()throws FileNotFoundException{
		System.out.println("--------7");
		//FileReader f = new FileReader(new FileReader("abc.txt));//error no suitable const
		//FileReader f = new FileReader(new File());//file Const must have file as a string ..doubt
		FileReader f = new FileReader(new File("anc.txt"));//unreported excdption must be caught or declare to be thrown
		System.out.println("--------8");
	}
}