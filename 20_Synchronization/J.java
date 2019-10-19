class A
{
}
class B
{
}
class MyRunnable1 implements Runnable
{
	public void run(){
		synchronized(J.a){
			try{Thread.sleep(50);}catch(Exception e){ e.printStackTrace(); }
			synchronized (J.b){
				System.out.println("hello");
			}
		}
	}
}
class MyRunnable2 implements Runnable
{
	public void run(){
		synchronized(J.b){
			try{Thread.sleep(50);}catch(Exception e){ e.printStackTrace(); }
			synchronized (J.a){
				System.out.println("hello");
			}
		}
	}
}
class J
{
	static A a = new A();
	static B b = new B();
		public static void main(String[] args){
			new Thread(new MyRunnable1(),"Gholu").start();
			new Thread(new MyRunnable2(),"Bholu").start();
		}

}