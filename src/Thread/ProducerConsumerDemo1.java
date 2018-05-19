 package Thread;
import java.util.concurrent.locks.*;
 class Resource
 {
	 String x;
	public String toString()
	 {
		x="烤鸭";
		return x;
	 }
 }
 
 class BoundedBuffer {
   final Lock lock = new ReentrantLock();
   final Condition notFull  = lock.newCondition(); 
   final Condition notEmpty = lock.newCondition(); 

   final Object[] items = new Object[100];
   int putptr, takeptr, count;

   public void put(Object x) throws InterruptedException {
     lock.lock();
     try {
       while (count == items.length) 
         notFull.await();
       items[putptr] = x;
       if (++putptr == items.length) putptr = 0;
       ++count;
	   System.out.println("生产"+x.toString()+count);
       notEmpty.signal();
     } finally {
       lock.unlock();
     }
   }

   public Object take() throws InterruptedException {
     lock.lock();
     try {
       while (count == 0) 
         notEmpty.await();
       Object x = items[takeptr]; 
       if (++takeptr == items.length) takeptr = 0;
	   System.out.println("消费"+count);
       --count;
       notFull.signal();
       return x;
     } finally {
       lock.unlock();
     }
   } 
 }
 
 class Producer implements Runnable
 {
	 BoundedBuffer b=new BoundedBuffer();
	 Resource r=new Resource();
     Producer(BoundedBuffer b,Resource r)
	 {
		 this.b=b;
		 this.r=r;
	 }
	 public void run()
	 {
		 while(true)
		 {
			 try
			 {
				b.put(r);
			 }
			 catch (InterruptedException i)
			 {
			 }
		 }

	 }

 }
 class Consumer implements Runnable
 {
	 BoundedBuffer b=new BoundedBuffer();
	 Resource r=new Resource();
     Consumer(BoundedBuffer b)
	 {
		 this.b=b;
	 }
	 public void run()
	 {
		 while(true)
		 {
			 try
			 {
				r=(Resource)b.take();
			 }
			 catch (InterruptedException i)
			 {
			 }
		 }
		 
	 }

 }

class  ProducerConsumerDemo1
{
	public static void main(String[] args) 
	{
		Resource r=new Resource();
		BoundedBuffer b=new BoundedBuffer();
		Producer p=new Producer(b,r);
		Consumer c=new Consumer(b);
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