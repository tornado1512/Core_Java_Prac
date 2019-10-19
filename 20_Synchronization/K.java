class A
{
	static void abc(){
		for(int i = 0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}

class MyRunnable1 implements Runnable
{
	public void run(){
		A.abc();
	}
}


class MyRunnable2 implements Runnable
{
	public void run(){
		synchronized (A.class){
			for(int i=0;i<10;i++)
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}

class K
{
	public static void main(String[] args){
		new Thread(new MyRunnable1(),"bholu").start();
		new Thread(new MyRunnable2(),"sholu").start();
	}
}