class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class L
{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"Mohan");
		Thread t1 = new Thread(r,"Gohan");
		t.start();
		t1.start();
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}	}
}