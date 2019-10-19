class MyThread extends Thread
{
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class J
{
	public static void main(String[] args){
		MyThread t1 = new MyThread ();
		MyThread t2 = new MyThread ();
		MyThread t3 = new MyThread ();
		t1.setName("Mohan");
		t2.setName("Sohan");
		t3.setName("Gohan");
		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}