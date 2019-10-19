class MyRunnable implements Runnable
{
	public void run(){
		for(int i = 0 ; i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class T
{
	 public static void main (String [] args)throws InterruptedException{
		Thread t = new Thread(new MyRunnable(),"mohan");
		t.start();
		t.join(100);
		for(int i = 0 ; i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	 }
}