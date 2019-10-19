class A 
{
	public static void main(String[] args){
		Thread t = Thread.currentThread();//it will return the refrence of  that thread object which is responsible for making of thread
		System.out.println(t);
		System.out.println(Thread.currentThread());
	}
}