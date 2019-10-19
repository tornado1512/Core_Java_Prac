class MyThread extends Thread
{
	public void run(){
	
	}
}
class YourThread extends Thread
{
	public void run(){
	
	}
}
class H
{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();
		//t1.start();doubt
		t1.setName("Ganesh");
		t1.setPriority(4);
		t2.setName("Kartik");
		t2.setPriority(2);
		//t2.start();doubt

		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());

		System.out.println("###################33");
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());
		System.out.println(t2.isAlive());
	}
}