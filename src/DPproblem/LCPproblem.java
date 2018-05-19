package DPproblem;

public class LCPproblem {

	public static void LCSLength(int[] x,int[] y, int[][] b) {
		int[][] c=new int[x.length+1][y.length+1];
		for(int i=0;i<x.length+1;i++) {
			c[i][0]=0;
		}
		for(int i=0;i<y.length+1;i++) {
			c[0][i]=0;
		}
		for(int i=1;i<x.length+1;i++) {
			for(int j=1;j<y.length+1;j++) {
				if(x[i-1]==y[j-1]) {
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]=1;
				}
				else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j]=c[i-1][j];
					b[i][j]=2;
				}
				else {
					c[i][j]=c[i][j-1];
					b[i][j]=3;
				}
					
				
			}
		}
		//return c;
		
	}
	
    public static void LCS(int[] x, int m, int n,int[][] b) {
    	//int m=x.length;
    	//int n=y.length;
    	if(m==0 || n==0) {
    		return;
    	}
    	if(b[m][n]==1) {
    		LCS(x,m-1,n-1,b);
    		System.out.print(x[m-1]+" ");
    	}
    	else if(b[m][n]==2)
    		LCS(x,m-1,n,b);
    	else if(b[m][n]==3)
    		LCS(x,m,n-1,b);
    }
	public static void main(String[] args) {
         int[] x= {1,2,3,4,5,6,7,8,10,7};
         int[] y= {1,4,6,8,9,10};
         int[][] b=new int[x.length+1][y.length+1];
         LCSLength(x,y,b);
         int m=x.length;
         int n=y.length;
         LCS(x,m,n,b);
	}

}
