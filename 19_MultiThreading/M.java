class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class M
{
	public static void main(String [] args) throws InterruptedException{
		Thread t = new Thread (new MyRunnable(),"Mohan");
		t.start();
		//Thread.sleep(100);//interrupted Exception must be caugth or declare
		Thread.sleep(100);
		for(int i=0;i<50;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}