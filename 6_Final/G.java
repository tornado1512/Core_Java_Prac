class M
{
	void abc(){
	System.out.println("abc of M");
	}
	final void pqr(){
	System.out.println("pqr of M");
	}
	void mno(){
	System.out.println("mno of M");
	}
}
class G extends M
{
	void abc(){
	System.out.println("abc of G");
	}
	//void pqr(){								// pqr() in G cannot override pqr() in M as pqr() is final
	//System.out.println("pqr of G");
	//}
	void mno(){
	System.out.println("mno of +G");
	}
	public static void main(String [] args){
		//case 1
		/*
		G g = new G();
		g.abc();
		g.pqr();
		g.mno();
		*/
		//case2
		
		M m = new M();
		m.abc();
		m.pqr();
		m.mno();
	}
	
	
}