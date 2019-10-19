class MyRunnable implements Runnable
{
	public void run(){
		try{
		R.r.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}	
		System.out.println("inside run()");
	}
}

class R
{	static Thread r = Thread.currentThread();
	public static void main(String[] args) throws InterruptedException{
		Thread d = new Thread(new MyRunnable(),"mohan");
		d.start();
		d.join();
		System.out.println("inside main()");
	}
}