class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class MyRunnable2 implements Runnable
{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+Thread.currentThread().getName());
				if(i>11&&i<16){
					System.out.println("Giyan is going to yield");
					Thread.yield();
			}
		}
	}
}
class O
{
	public static void main(String[] args){
		Thread t = new Thread(new MyRunnable (),"Mohan");
		t.start();
		Thread t1= new Thread(new MyRunnable2(),"Giyan");
		t1.start();

		for(int i=0;i<20;i++){
			System.out.println(i+Thread.currentThread().getName());
		}	

	}
}