class MyRunnable implements Runnable
{
	public void run(){
		for(int i = 0 ; i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class S 
{
	public static void main(String[] args){
		Thread t = new Thread (new MyRunnable(),"mohan");
		Thread t1 = new Thread(new MyRunnable(),"Giyan");
		Thread t2 = new Thread(new MyRunnable(),"Dholun");
		t.setPriority(2);
		t1.setPriority(6);
		t2.setPriority(8);

		t.start();
		t1.start();
		t2.start();
		Thread.currentThread().setPriority(10);
		for(int i = 0 ; i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}

}