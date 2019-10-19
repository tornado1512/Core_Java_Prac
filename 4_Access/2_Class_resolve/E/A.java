class A{										//compiler does not  check class B in that file whose name is different as of  B .java
	public static void main(String[] args){
		B b=new B();
		System.out.println(b.x); 
	}
}
