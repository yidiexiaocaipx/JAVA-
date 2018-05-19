package Exception;
class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}
class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}
class Computer
{
	private int status=2;
//	Computer(){};
	public void run()  throws LanPingException,MaoYanException
	{
		
		if (status==1)
		{
			throw new LanPingException("电脑蓝屏");
		}
		if (status==2)
		{
			throw new MaoYanException("电脑冒烟");
		}
		System.out.println("电脑运行");
	}
	public void reset()
	{
		System.out.println("电脑重启");
	}

}

class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name=name;
		comp=new Computer();
	}
	public void prelect()   throws NoPlanException
	{
		try
		{
			comp.run();
			
		}
		catch (LanPingException e)
		{
			System.out.println(e.toString());
			comp.reset();
//			prelect();
		}
		catch (MaoYanException e)
		{
			System.out.println(e.toString());
			test();	
			throw new NoPlanException("原因:"+e.getMessage());
		}
		System.out.println(name+"讲课");
		
	}
	public void test()
	{
		System.out.println("练习");
	}

}

class  ExceptionTest
{
	public static void main(String[] args) 
	{
		Teacher t=new Teacher("陈老师");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			e.printStackTrace();
//			System.out.println(e.toString());
		}
		
	}
}
