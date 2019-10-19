class X
{
	synchronized void abc(){
		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	 void pqr(){
		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}

	}
}
class MyRunnable1 implements Runnable
{
	public void run(){
		E.x.abc();
	}
}
class MyRunnable2 implements Runnable
{
	public void run(){
		E.x.pqr();
	}
}
class E
{
	static X x = new X();
	public static void main(String[] args){
		new Thread( new MyRunnable1(),"Bholu").start();
		new Thread( new MyRunnable2(),"Gholu").start();
	}
}