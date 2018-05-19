package Exception;
class FuShuIndexException extends Exception
{
	FuShuIndexException()
	{}
	FuShuIndexException( String a)
	{
		super(a);
	}
}
class Demo
{
     public  static void method(int[] arr, int num) throws NullPointerException,FuShuIndexException
	{
		 if (arr==null)
		 {
			 throw new NullPointerException("数组为空");
		 }
		 if (num>=arr.length)
		 {
			 throw new ArrayIndexOutOfBoundsException("数组角标越界"+num);
		 }
	 
		if (num<0)
			throw new FuShuIndexException("角标为负");
		
	}
}
class  ExceptionDemo 
{
	public static void main(String[] args) //throws FuShuIndexException
	{
		int[] arr=new int[3];
		try
		{
			new Demo().method(null,-1);
		}

		catch (NullPointerException e)
		{
			System.out.println("数组为空！");
//			return;
			System.exit(0);
		}

		catch (FuShuIndexException e) //捕捉
		{
//			System.out.println("message："+e.getMessage());
//			System.out.println("string"+e.toString());
			System.out.println("角标为负!");
//			e. printStackTrace();
		}
		catch (Exception e)
		{
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("over");
//		method(arr,3);
	}
	
}
