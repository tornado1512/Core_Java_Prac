class MyRunnable implements Runnable
{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}
class N
{
	public static void main(String [] args) {
		Thread t = new Thread (new MyRunnable(),"Mohan");
		t.start();
		try{
		t.sleep(100);//reason?????????
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		for(int i=0;i<50;i++){
			System.out.println(i+Thread.currentThread().getName());
		}
	}
}