package one_bitandtwo_bitCharacters;

public class Palindrome_Number {
	  public static boolean isPalindrome(int x) {
	        String temp=Integer.toString(x);
	        int i=0;
	        int j=temp.length()-1;
	        int mid=(i+j)/2;
//	        if(temp.charAt(0)=='-' || temp.charAt(0)=='+')
//	            i++;
	        if(temp.charAt(0)=='-')
	            return false;
	        while(temp.charAt(i++)==temp.charAt(j--) && i<=(temp.length()-1) && (j>=0)){
	        	if(i>mid)
	        		return true;
	        }
//	        if (i>=j)
//	            return true;
//	        else
//	            return false;
	        return false;
	    }
	public static void main(String[] args) {
			int x=11;
			boolean temp=isPalindrome(x);
			System.out.println(temp);
	}

}
