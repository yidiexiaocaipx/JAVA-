package Thread;
class StopThread implements Runnable
{
	boolean flag=true;
	public synchronized void run()  
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"...");
//				flag=false;
			}

				System.out.println(Thread.currentThread().getName()+"...++++++");
		}
	}
	public void setFlag()
	{
		flag=false;
	}

}
class  StopThreadDemo
{
	public static void main(String[] args) 
	{
		StopThread s=new StopThread();
		Thread t1=new Thread(s); 
		Thread t2=new Thread(s);
		t1.start();
		t2.setDaemon(true);
		t2.start();
		int num=0;
		for (; ; )
		{
			if (++num==50)
			{
				t1.interrupt();
//				t2.interrupt();
//				s.setFlag();
				break;
			}
			System.out.println("main"+num);
		}

		System.out.println("over");

	}
}
