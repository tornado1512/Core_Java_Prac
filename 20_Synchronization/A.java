class Account
{
	String acNum="1234";
	String acType="sv";
	int balance = 50;
	int getBalance(){
		return balance;
	}
	void withDrawl(int amt){
		balance=balance-amt;
	}
}
class MyRunnable implements Runnable
{
	public void run(){
		for(int i = 0;i<5;i++){
			System.out.println(i+Thread.currentThread().getName()+"is going to withdraw and current balance is ::"+A.account.getBalance());
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e )
			{
				e.printStackTrace();
			}
			
			A.account.withDrawl(10);
		}
	}
}
class A
{
	static Account account = new Account();
		public static void main(String[] args){
			Thread t1 = new Thread(new MyRunnable(),"Mohan");
			Thread t2 = new Thread(new MyRunnable(),"Gohan");
			t1.start();
			t2.start();
		}
}