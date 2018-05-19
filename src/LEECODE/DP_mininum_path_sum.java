package LEECODE;

public class DP_mininum_path_sum {
   public static int DP_Solution(int[][] grid) {
	   int m=grid.length;  //行数
	   int n=grid[0].length;  //列数
	   int[][] c=new int[m][n];
	   c[0][0]=grid[0][0];
	   for(int i=1;i<m;i++) {
		   
		   c[i][0]=c[i-1][0]+grid[i][0];
	   }
	   for(int j=1;j<n;j++) {
		   c[0][j]=c[0][j-1]+grid[0][j];
	   }
	   for(int i=1;i<m;i++) {
		   for(int j=1;j<n;j++) {
			   c[i][j]=grid[i][j]+Math.min(c[i-1][j], c[i][j-1]);
		   }
	   }
	   return c[m-1][n-1];
   }
   public static void main(String[] args) {
	   int[][] grid= {{1,2,5},{3,2,1}};
	   int sum=DP_Solution(grid);
	   System.out.println(sum);
   }
}
