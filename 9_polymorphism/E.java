class A 
{
	void pro1(){
	System.out.println("pro()in A");
	}
}
class B extends A
{
	void pro2(){
	System.out.println("pro()in B");
	}
}
class C extends B
{
	void pro3(){
	System.out.println("pro()in C");
	}
}
class E
{
	public static void main(String [] args){
	//case1
	/*
	C c = new C();
	c.pro1();
	c.pro2();
	c.pro3();
	System.out.println(c.toString());
	*/
	//case2
	/*B d = new C();//c object will behve like B
	d.pro1();
	d.pro2();
	d.pro3();
	System.out.println(c.toString());
	*/
	//case3
	/*A a = new C();
	a.pro1();
	//a.pro2();
	//a.pro3();
	System.out.println(a.toString());
	*/
	//case4
	//Object o = new C();
	//o.pro1();
	//o.pro2();
	//o.pro3();
	//System.out.println(o.toString());


	}


}