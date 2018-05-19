package LEECODE;

public class DP_minDistance {
	public static int minDistance(String word1,String word2) {
		
		int m=word1.length();
		int n=word2.length();
		if(m==0 && n==0) {
			return 0;
		}
		if(m==0) {
			return n;
		}
		if(n==0) {
			return m;
		}
		int[][] dis=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			dis[i][0]=i;
		}
		for(int j=0;j<=n;j++) {
			dis[0][j]=j;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(word1.charAt(i-1)==word2.charAt(j-1)) {
					dis[i][j]=dis[i-1][j-1];
				}
				else
				    dis[i][j]=Math.min(Math.min(dis[i-1][j], dis[i][j-1]), dis[i-1][j-1])+1;
			}
		}
		return dis[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1="a";
		String word2="b";
		int dis=minDistance(word1,word2);
		System.out.println(dis);

	}

}
