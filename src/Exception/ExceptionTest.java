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
			throw new LanPingException("��������");
		}
		if (status==2)
		{
			throw new MaoYanException("����ð��");
		}
		System.out.println("��������");
	}
	public void reset()
	{
		System.out.println("��������");
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
			throw new NoPlanException("ԭ��:"+e.getMessage());
		}
		System.out.println(name+"����");
		
	}
	public void test()
	{
		System.out.println("��ϰ");
	}

}

class  ExceptionTest
{
	public static void main(String[] args) 
	{
		Teacher t=new Teacher("����ʦ");
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
