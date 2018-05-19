package Thread;

import java.util.concurrent.locks.ReentrantLock;

class Account{
	private final ReentrantLock Lock=new ReentrantLock();
	private String AccountNo;
	private double balance;
	
	public Account(String accountNo, double balance) {
		//super();
		AccountNo = accountNo;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return AccountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AccountNo == null) ? 0 : AccountNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (AccountNo == null) {
			if (other.AccountNo != null)
				return false;
		} else if (!AccountNo.equals(other.AccountNo))
			return false;
		return true;

	}
	public void  draw(double drawAmount)
	{
		Lock.lock();
		try {
		if(drawAmount<=balance)
		{
			System.out.println(Thread.currentThread().getName()+"È¡Ç®³É¹¦£º"+drawAmount);
			setBalance(balance-drawAmount);
			System.out.println("Óà¶î"+getBalance());
			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"È¡Ç®Ê§°Ü£¬Óà¶î²»×ã");
		}
		}
		finally {
			Lock.unlock();
		}
	}
}
class DrawThread extends Thread{
	private Account account;
	private double drawAmount;
	DrawThread(){
		super();
	}
	DrawThread(String name, Account account, double drawAmount){
		super(name);
		this.account=account;
		this.drawAmount=drawAmount;
	}
	public void run() {
//		synchronized(account) {
//		if(drawAmount<=account.getBalance())
//		{
//			System.out.println(getName()+"È¡Ç®³É¹¦£º"+drawAmount);
//			account.setBalance(account.getBalance()-drawAmount);
//			System.out.println("Óà¶î"+account.getBalance());
//			
//		}
//		else
//		{
//			System.out.println(getName()+"È¡Ç®Ê§°Ü£¬Óà¶î²»×ã");
//		}
//		
//
//		}
		account.draw(drawAmount);
		
	}
	
}
public class SynchroniazedDemo {

	public static void main(String[] args) {
          Account acct=new Account("1234",1000);
          new DrawThread("¼×",acct,600).start();
          new DrawThread("ÒÒ",acct,600).start();
	}

}
