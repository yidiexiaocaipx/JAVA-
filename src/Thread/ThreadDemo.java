package Thread;

import java.util.Date;

class FirstThread extends Thread {
	private int i;
	FirstThread(String name)
	{
		super(name);
	}
	public void run() {
		for(;i<100;i++)
		{
			System.out.println(this.getName()+":"+i);
			if(i==20)
			{
				Thread.yield();
			}
		}

	}
}
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		FirstThread ft=new FirstThread("线程0");
		ft.start();
		FirstThread ft1=new FirstThread("线程1");
		ft1.start();
//		for(int i=0;i<100;i++) {
//			System.out.println(Thread.currentThread().getName()+":"+i+new Date());
////			if(i==20)
////			{
////				FirstThread fs=new FirstThread("插入线程");
////				fs.start();
////				fs.join();
////				//new FirstThread().start();
////				//new FirstThread().start();
////			}
//			Thread.sleep(1000);
//			
////			if(i>20 && ! ft.isAlive()) 
////			{
////				ft.start();
////			}
//			
//			
//		}
		}
	}


