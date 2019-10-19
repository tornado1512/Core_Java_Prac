class A{
	void pro(){
		System.out.println("Helloo");
	}
	public static void main(String[] args){
		A a = new A();
		a.pro();
		//a.show();
		a.toString();
		System.out.println(a.hashCode());
	}
}