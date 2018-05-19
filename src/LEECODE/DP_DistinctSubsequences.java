package LEECODE;

public class DP_DistinctSubsequences {

	public static int numDistinct(String S,String T) {
		if(S.length()<T.length()) {
			return 0;
		}
		if(S.length()==T.length()) {
			if(S.equals(T))
				return 1;
			else
				return 0;
		}
		int[][] a=new int[S.length()+1][T.length()+1];
		for(int i=0;i<=S.length();i++) {
			a[i][0]=1;
		}
		for(int j=1;j<=T.length();j++) {
			a[0][j]=0;
		}
		for(int i=1;i<=S.length();i++) {
			for(int j=1;j<=T.length();j++) {
				if(S.charAt(i-1)==T.charAt(j-1))   
					a[i][j]=a[i-1][j]+a[i-1][j-1];  //不选择S[i-1],选择S[i-1],
				else
					a[i][j]=a[i-1][j];       //不选择S[i-1]
			}
		}
//		for(int i=1;i<=S.length();i++) {
//			for(int j=Math.min(i, T.length());j>=0;j--) {
//				if(S.charAt(i-1)==T.charAt(j-1))
//					a[i][j]=a[i-1][j]+1;
//				else
//					a[i][j]=a[i-1][j];
//			}
//		}
		return a[S.length()][T.length()];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="rabbbit";
        String b="rabbit";
        int num=numDistinct(a,b);
        System.out.println(num);
	}

}
