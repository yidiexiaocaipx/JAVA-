package one_bitandtwo_bitCharacters;

public class StrStr {
	public static int strStr(String haystack, String needle)
	{
//		int index=haystack.indexOf(needle);	
//		return index;


//	   for(int i=0;;i++)
//		{
//			for(int j=0;;j++)
//			{
//				if(j==needle.length()) return i;
//				if (i+j==haystack.length()) return -1;
//				if(needle.charAt(j)!=haystack.charAt(i+j))  break;
//			}
//		}
//		ArrayList a=new
		int l1=haystack.length();
		int l2=needle.length();
		if(l1<l2)  return -1;
		if(l2==0) return 0;
		int threshold=l1-l2;
		for(int i=0;i<=threshold;i++)
			if(haystack.substring(i, i+l2).equals(needle))
				return i;
	    return -1;
		
		
	}

	public static void main(String[] args) {
        String s="hello";
        String needle="jj";
        System.out.println (strStr(s,needle));
		
	}

}
