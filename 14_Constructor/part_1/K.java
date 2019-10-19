class A{
	char u = 'A';
	A(){
	super();
	this.u='A';
	}
}
class B extends A{
	float f = 3.14f;
	B(){
		super();
		this.f=3.14f;
	}
}
class K extends B
{
	int a = 3;
	K(){
		super();
		this.a=3;
	}
	public static void main(String[] args){
		K k = new K();
		System.out.println(k.u);
		System.out.println(k.f);
		System.out.println(k.a);
	}
}