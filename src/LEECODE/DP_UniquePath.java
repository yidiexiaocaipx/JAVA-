package LEECODE;

public class DP_UniquePath {

	 public static int DP_Solution(int[][] obstacleGrid) {
		   int m=obstacleGrid.length;  //行数
		   int n=obstacleGrid[0].length;  //列数
		   int[][] c=new int[m][n];
		   if(obstacleGrid[0][0]==1) {
			   c[0][0]=0;
		   }
		   else
			   c[0][0]=1;
		   
		   for(int i=1;i<m;i++) {
			   if(obstacleGrid[i][0]==1)
				   c[i][0]=0;
			   else
			       c[i][0]=c[i-1][0];		   
		   }
		   for(int j=1;j<n;j++) {
			   if(obstacleGrid[0][j]==1)
				   c[0][j]=0;
			   else
			       c[0][j]=c[0][j-1];		   
		   }

		   for(int i=1;i<m;i++) {
			   for(int j=1;j<n;j++) {
				   if(obstacleGrid[i][j]!=1)
				   c[i][j]=c[i-1][j]+ c[i][j-1];
				   else
					   c[i][j]=0;
					   
			   }
		   }
		   return c[m-1][n-1];
	   }
	   public static void main(String[] args) {
		   int[][] grid= {{0,0,0},{0,1,0},{0,0,0}};
		   int num=DP_Solution(grid);
		   System.out.println(num);
	   }

}
