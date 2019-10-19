class MyThread extends Thread
{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
	}
}

class E
{
	public static void main(String[] args){
		MyThread t = new MyThread();
		//st.setName("mohan");
		t.start();//if you do not call start() then run method will ru on main Thread and new thread is not created
		//doubt that while running run() alwys main print????????

		
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread());
	}
}