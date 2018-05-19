package Exception;

public class ThrowTest {

	public static void main(String[] args) {
     try
     {
    	 throwcheck(3);
     }
     catch(Exception e)
     {
    	 System.out.println(e.getMessage());
     }
     throwRuntime(-3);
	}

	private static void throwRuntime(int a) {
		if(a>0)
		{
			throw new RuntimeException("a值大于0");
		}
	}

	private static void throwcheck(int a) throws Exception{
		if(a>0)
		{
			throw new Exception("a值大于0");
		}
	}	

}
