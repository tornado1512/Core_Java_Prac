class A{												//here prefernce is given to class B present in source codes
	public static void main(String[] args){
		B b=new B();
		System.out.println(b.x);
	}
}
class B{
	int x=233;
}