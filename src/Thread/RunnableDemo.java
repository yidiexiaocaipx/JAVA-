package Thread;
class SecondThread implements Runnable {
	private int i;
	public void run() {
		for(;i<100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
public class RunnableDemo {
    
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==20)
			{
				Thread.sleep(1);
				SecondThread st=new SecondThread();
				new Thread(st,"线程1").start();
				new Thread(st,"线程2").start();
			}
		}
		}
	}

