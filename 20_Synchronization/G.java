class X
{
	synchronized static void abc(){
		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
	synchronized void pqr(){
		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}

	}
}
class MyRunnable1 implements Runnable
{
	public void run(){
		G.x.abc();
	}
}
class MyRunnable2 implements Runnable
{
	public void run(){
		G.x.pqr();
	}
}
class G
{
	static X x = new X();
	public static void main(String[] args){
		new Thread( new MyRunnable1(),"Bholu").start();
		new Thread( new MyRunnable2(),"Gholu").start();
	}
}