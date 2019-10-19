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
class G
{
	public static void main(String[] args){
		
		MyThread t1 = new MyThread();
		//t1.start();//why it is not alive
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());
		

		System.out.println("######################");
		/*
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());
		System.out.println(t2.isAlive());
	*/
		/*
		System.out.println("######################");
		Thread t3 = Thread.currentThread();
		System.out.println(t3.getName());
		System.out.println(t3.getId());
		System.out.println(t3.getPriority());
		System.out.println(t3.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t3.isAlive());
		*/
	}
}