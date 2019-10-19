class Account
{
	String acType="sv";
	String acNo= "1234'";
	private int balance = 10;//mark property as private which ae going to affect

	synchronized int getBalance(){
		return balance;
	}
	synchronized void withDrawl(int amt){
		if (amt<=balance){
			balance = balance -amt;
		}
		else
			System.out.println("insufficnet balance");
	}
}
class MyRunnable implements Runnable
{
	public void run(){
		for(int i = 0 ; i<5;i++){
			System.out.println(i+Thread.currentThread().getName()+"is going to withdraw"+C.account.getBalance());
			C.account.withDrawl(10);
		}
	}
}
class C
{
	static Account account= new Account();
	public static void main(String[] args){
		Thread t1 = new Thread(new MyRunnable() ,"Gholu");
		Thread t2 = new Thread(new MyRunnable (),"Jholu");
		t1.start();
		t2.start();
	}
}