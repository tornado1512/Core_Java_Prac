class MyThread extends Thread
{
	public void run(){
		System.out.println();
	}
}

class F
{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		t.start();//thorwa IllegalThreadStateException
	}
}