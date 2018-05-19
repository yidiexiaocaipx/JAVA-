package one_bitandtwo_bitCharacters;



public class CommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
//		if (strs.length==0)
//			return " ";
//		   int MinLength=strs[0].length();
//		   int index=0;
//		 for (int m=0;m<strs.length;m++)
//		    {
//		        int l=strs[m].length();
//		        if(l<=MinLength)
//		        {
//		        	MinLength=l;
//		        	index=m;		        	
//		        }
//		    }
//	    StringBuilder temp=new StringBuilder();
//	    int i=0;
//	    while(i<strs[index].length())
//	    {
//	        int j=0;
//	        while(j<strs.length && strs[j].charAt(i)==strs[index].charAt(i))
//	        {
//	        	j++;
//	        }
//	        if (j==strs.length)
//	        {
//	            temp.append(strs[index].charAt(i));
//	            i++;
//	        }
//	        else
//	        	break;
//	    }
//	    if (i==0)
//	    	return "";
//	    else
//	          return temp.toString();
	    
	    
	    
	    // 
	    if (strs==null || strs.length==0) return "";
	    String pre=strs[0];
//	    int j=1;
	    int i=1;
	    while(i<strs.length)
	    {
	      while(strs[i].indexOf(pre)!=0)
	    	pre=pre.substring(0, pre.length()-1);
	      i++;
	    }
	    return pre;
	    
	}
	public static void main(String[] args) {
            String[] strs= {"aca","acba"};
           String temp=longestCommonPrefix(strs);
            System.out.println(temp);
//            System.out.println(strs[0].charAt(0));
//            System.out.println(strs[1].charAt(0));
            
	}

}
