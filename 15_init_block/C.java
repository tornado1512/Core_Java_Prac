class C
{
	static {
	System.out.println("helo;");//static init block call onc only at time of loading of class
	}
	public static void main(String[] args){
		C b1 = new C();
		C b2 = new C();
		C b3 = new C();
		
	}
}