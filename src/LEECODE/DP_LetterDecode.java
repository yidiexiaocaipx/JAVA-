package LEECODE;

public class DP_LetterDecode {

	public static int numDecodings(String s) {
		if (s==null || s.length()==0) {
			return 0;
		}
		if(s.charAt(0)=='0')
			return 0;

		if(s.length()==1) {
			return 1;
		}
		int[] num=new int[s.length()+1];
		num[0]=1;
		num[1]=1;
		for(int i=2;i<num.length;i++) {
			String s1=s.substring(i-2, i);
			int value=Integer.parseInt(s1);
		//	System.out.println(value);
			if(value==0)
				return 0;
			else if(value<=26) {
		    	if(s.charAt(i-1)=='0')
		    		num[i]=num[i-2];
		    	else if(s.charAt(i-2)=='0')
		    	    num[i]=num[i-1];
		    	else
		    	  num[i]=num[i-1]+num[i-2];
		    }
		    else {
		    	if(s.charAt(i-1)=='0') {
		    		return 0;
		    	}
		    	else
		    		num[i]=num[i-1];
		    }
		  //  System.out.println(num[i]);
		    	
		}
		return num[s.length()];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100";
		int num=numDecodings(s);
		System.out.print(num);

	}

}
