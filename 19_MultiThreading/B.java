class B
{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println("Name of current Thread is "+t.getName());
		System.out.println("Id of current thread is"+t.getId());
		System.out.println("Priority of current Thread is"+t.getPriority());
		System.out.println("State of current thread is "+t.isAlive());

	}
}