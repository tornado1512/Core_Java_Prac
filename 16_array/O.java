interface X{}
class A implements X{}
class B implements X{}
class O
{
	public static void main(String[] args){
		
		//case7
		X [] x = new X [2];
		x[0] = new A();
		x[1] = new A();
		for(  A a: x)
			System.out.println(a);
		//case6
		/*
		X[] x = new X[2];
		x[0] = new A();
		x[1] = new B();
		for( X a: x)
		System.out.println(a);
		*/	
	
		//case5
		/*
		X [] x = new X [2];
		System.out.println(x.length);
		for(X a: x){
		
		System.out.println(a);	
		}
		*/
		//case4
		//X x = new A();//we can assign object of child class in ref var of interface 


		//case3
		//X [] x = new X[2];//an array of interface

		//case2
		//X x = new X();//x cannot be instantiated

		//case1
		//X x ;	
	}
}