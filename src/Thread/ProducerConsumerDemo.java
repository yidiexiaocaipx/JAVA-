package Thread;
import java.util.concurrent.locks.*;
class Resource
{
	private String name;
	private int count=1;
	private boolean flag=false;
	Lock lock=new ReentrantLock();
	Condition pro_con=lock.newCondition();
	Condition con_con=lock.newCondition();
	public void set(String name)
	{
//		while(true)
//		{
			lock.lock();
			try
			{
				while(flag)
				{
					try{pro_con.await();} catch(InterruptedException i){}
				}
				this.name=name+count;
				System.out.println(Thread.currentThread().getName()+"生产者"+this.name);
				count++;
				flag=true;
				con_con.signal();
			}
			finally
			{
				lock.unlock();
			}	

//		}

	}
	public  void out()
	{
//		while(true)
//		{
			lock.lock();
			try
			{
				while(!flag)
				{
					try{con_con.await();}catch(InterruptedException i){}
				}
				System.out.println(Thread.currentThread().getName()+"消费者    "+this.name);
				flag=false;
				pro_con.signal();
			}
			finally
			{
				lock.unlock();
			}	

//		}
	}
}

class Producer implements Runnable
{
	Resource r=new Resource();
	Producer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
		{
			r.set("烤鸭");
		}
	}
}
class Consumer implements Runnable
{
	Resource r=new Resource();
	Consumer(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}



class  ProducerConsumerDemo
{
	public static void main(String[] args) 
	{
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}
