class A
{
	synchronized void abc(){
		try{Thread.sleep(50);}catch(InterruptedException e){ e.printStackTrace();}
		I.b.mno();
	}

	synchronized void xyz(){
	
	}
}
class B
{
	synchronized void pqr(){
				try{Thread.sleep(50);}catch(InterruptedException e){ e.printStackTrace();}
		I.a.xyz();
	}

	synchronized void mno(){
	
	}
}


class MyRunnable1 implements Runnable
{
	public void run(){
		I.a.abc();
	}	
} 


class MyRunnable2 implements Runnable
{
	public void run(){
		I.b.pqr();
	}
} 

class I
{
	static A a = new A();
	static B b = new B();
	public static void main(String[] args){
		new Thread(new MyRunnable1(),"Bholu").start();
		new Thread(new MyRunnable2(),"Dholu").start();

	}
}