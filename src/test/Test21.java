package test;

public class Test21 {
    /*
     * 查找子串出现的次数
     */
	public static void main(String[] args) {
		String str="nbadfghnbaeorldnba";
		String key="nba";
		int count=getKeyStringCount(str,key);
		System.out.print(count);
	}

	public static int getKeyStringCount(String str, String key) {
		int count=0;
		int index=0;
		
	    while((index=str.indexOf(key, index+key.length()))!=-1)
	    {
//	    	index=str.indexOf(str, index+key.length());
//	    	str=str.substring(index+key.length());
//	    	index=index+key.length();
	    	count=count+1;
	    }
		return count;
		
	}

}
