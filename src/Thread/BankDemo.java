package Thread;
class Bank
{
	private  int sum;
	private Object obj=new Object();
	public synchronized void  save (int num)
	{
//		synchronized (obj)
//		{
			sum=sum+num;
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException t)
			{
			}
			System.out.println(Thread.currentThread().getName()+"sum="+sum);
//		}
	}
}

class Cur implements Runnable
{
	 Bank b=new Bank();
	 public void run()
	 {
		 for (int i=0;i<3 ;i++ )
		 {
			 b.save(100);
		 }
	 }
	
}


class  BankDemo
{
	public static void main(String[] args) 
	{
		Cur c=new Cur();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
