class MyThread extends Thread
{
	public void run(){
		
	}
}

class I
{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setPriority(2);
		//t.setPriority();one parameterised
		t.setPriority(11);//illegalArgumentException

	}
}