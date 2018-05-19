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
			 throw new NullPointerException("����Ϊ��");
		 }
		 if (num>=arr.length)
		 {
			 throw new ArrayIndexOutOfBoundsException("����Ǳ�Խ��"+num);
		 }
	 
		if (num<0)
			throw new FuShuIndexException("�Ǳ�Ϊ��");
		
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
			System.out.println("����Ϊ�գ�");
//			return;
			System.exit(0);
		}

		catch (FuShuIndexException e) //��׽
		{
//			System.out.println("message��"+e.getMessage());
//			System.out.println("string"+e.toString());
			System.out.println("�Ǳ�Ϊ��!");
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
