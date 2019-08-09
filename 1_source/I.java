class A{
	    int age;
	    static int maxAge = 20;
	    String s;
	public static void main (String[] args){
		A a = new A();
		a.age = 18;
		a.s="Vishal";
		System.out.println(a.s+"  "+a.age+"  "+maxAge);
	}

}