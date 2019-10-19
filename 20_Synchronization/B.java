class Account 
{
	String acNo="1234";
	String acType="sv";
	int balance = 50;
	int getBalance()
	{
		return balance;
	}
	void withDrawl(int amt){
		if(amt<=balance){
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			balance = balance -amt;
		}
		else 
			System.out.println("insufficient balance");
	}
}
class MyRunnable implements Runnable 
{
	public void run(){
		for(int i= 0;i<5;i++){
			System.out.println(i+Thread.currentThread().getName()+"is going to withDral and current balance is::"+B.account.getBalance());
			B.account.withDrawl(10);
		}	
	}
}

class B
{
	static Account account = new Account();
	public static void main(String[] args){
		Thread t1 = new Thread(new MyRunnable(),"Dholu");
		Thread t2 = new Thread(new MyRunnable(),"Bholu");
		t1.start();
		t2.start();
	}
}