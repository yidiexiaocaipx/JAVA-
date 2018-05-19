package LEECODE;

public class DP_palindrome1 {

	public static int minCut(String s) {
		int[] D=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			D[i]=isPalindrome(0,i,s)?0:i;  //如果s[0,i]是回文D[i]=0 否则D[i]=i-0=i
			if(D[i]==0)
				continue;
			for(int j=1;j<=i;j++) {
			if(isPalindrome(j,i,s))    //如果s[i,j]是否是回文
				D[i]=Math.min(D[i], D[j-1]+1);
			else
				D[i]=Math.min(D[i], D[j-1]+1+i-j);
		}
		}
		return D[s.length()-1];
		
		
	}
	public static boolean isPalindrome(int i,int j,String s) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String a="aab";
		 System.out.println(minCut(a));
	}

}
