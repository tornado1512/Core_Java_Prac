class Q
{
	public static void main(String[] args)throws InterruptedException{
		Thread t =   Thread.currentThread();
		t.join();
	}
}
