
package Thread;
class Resource1
{
	private String name;
	private String sex;
	private boolean flag=false;
	public synchronized void set(String name, String sex)
	{
		if (flag)
			try{this.wait();}catch (InterruptedException i){}
		this.name=name;
		this.sex=sex;
		flag=true;
		this.notify();
	}
	public synchronized void out()
	{
		if (!flag)
			try{this.wait();}catch (InterruptedException i){}
		System.out.println(name+"+"+sex);
		flag=false;
		this.notify();
	}

}
class Input implements Runnable
{
	Resource1 r=new Resource1();
	Input(Resource1 r)
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;  
		while(true)
		{
			if (x==0)
				r.set("mike","nan");
			else
				r.set("lily","nv");
		    x=(x+1)%2;			
		}
		
	}
}
class Output implements Runnable
{
    Resource1 r=new Resource1();
	Output(Resource1 r)
	{
		this.r=r;
	}
	
	public void run()
	{
		while(true)
			r.out();   
	}
}



class  ResourceDemo
{
	public static void main(String[] args) 
	{
		Resource1 r=new Resource1();  //资源
		Input in=new Input(r);     //任务
		Output out=new Output(r);
		Thread t1=new Thread(in);
		Thread t2=new Thread(out);
		t1.start();
		t2.start();

	}
}
