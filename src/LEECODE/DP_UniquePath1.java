package LEECODE;

public class DP_UniquePath1 {

	public int UniquePath(int m,int n) {
		int[][] c=new int[m][n];
		int[][] Grid=new int[m][n];		   
		   for(int i=0;i<m;i++) {	   
				   c[i][0]=1;		   
		   }
		   for(int j=0;j<n;j++) {
				   c[0][j]=1;	   
		   }

		   for(int i=1;i<m;i++) {
			   for(int j=1;j<n;j++) {
				   c[i][j]=c[i-1][j]+ c[i][j-1];
					   
			   }
		   }
		   return c[m-1][n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	}

}
