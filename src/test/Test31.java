package test;

public class Test31 {

	public static void main(String[] args) {
			String s1="abcdefghjddefged";
			String s2="defkdefghjadoklb";
			String s=getMaxSubString(s1,s2);
			System.out.println(s);
	}

	public static String getMaxSubString(String s1, String s2) {
//		for(int i=0;i<s2.length();i++)
//		{
//			for(int a=0,b=s2.length()-i;b!=s2.length()+1;a++,b++)
//			{
//				String sub=s2.substring(a, b);
////				System.out.println(sub);
//				if(s1.contains(sub))
//					return sub;
//			}
//				
//			
//		}	
		String max=null;
		String min=null;
		if (s1.length()!=s2.length())
		{
		   min=(s1.length()<s2.length())? s1:s2;
		   max=(s1.length()>s2.length())? s1:s2;
		}
		else
		{
			min=s1;
			max=s2;
		}
			
		
		for(int i=min.length();i>0;i--)
		{
			for(int a=0,b=i;b!=min.length()+1;a++,b++)
			{
				String sub=min.substring(a, b);
//				System.out.println(sub);
				if(max.contains(sub))
					return sub;
			}
				
			
		}	
		return null;
	}

}
