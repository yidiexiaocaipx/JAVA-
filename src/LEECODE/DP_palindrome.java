package LEECODE;

class DP_palindromeSolution {

	private String s;
	private int[][] f=new int[1000][1000];
//	DP_palindromeSolution(String s){
//		this.s=s;
//	}
	public int minCut(String s) {
		this.s=s;
	//	int[][] f=new int[1000][1000];
		if(s.length()==0 || s==null)
			return 0;
		if(s.length()==1) {
			return 0;
		}
		for(int t=1;t<=s.length();t++) {
			for(int i=0,j=t-1;j<s.length();i++,j++) {
				f[i][j]=compCut(i,j);
			//	System.out.println(f[i][j]);
			}
			
		}
		return f[0][s.length()-1];
	}
	public int compCut(int i,int j) {
		if(isPalindrome(i,j)) {
			return 0;
		}
		if(i==j)
			return 0;
	//	else {
			int min=s.length();
			for(int k=i;k<j;k++) {
				int a=f[i][k];
				int b=f[k+1][j];
				int tmp=a+b+1;
				min=(tmp>min)?min:tmp;
			}
	//	}
		return min;
	}
	public boolean isPalindrome(int i,int j) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	
}
public class DP_palindrome{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="aabc";
        DP_palindromeSolution s=new DP_palindromeSolution();
        System.out.println(s.minCut(a));
	}
}

