package DPproblem;
/* m 包的容量
   n 物体个数
   w 重量数组
   p 价值数组
   */
public class PackageProblem {

	public static int[][] BackPack(int m,int n,int[] w,int[] p) {
		int c[][]=new int[n+1][m+1];
		for(int i=0;i<n+1;i++) {
			c[i][0]=0;
		}
		for(int i=0;i<m+1;i++) {
			c[0][i]=0;
		}
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				if(j>=w[i-1]) {
					c[i][j]=Math.max(c[i-1][j], c[i-1][j-w[i-1]]+p[i-1]);
				}
				else
					c[i][j]=c[i-1][j];
			}
		}
		return c;
	}
	public static int[] Traceback(int[][] c,int m,int n,int[] w,int[] p) {
		int[] x=new int[n];
		for(int i=n;i>0;i--) {
			if(c[i][m]==c[i-1][m]) {
				x[i-1]=0;
			}
			else {
				x[i-1]=1;
				m=m-w[i-1];
			}
			
		}
		return x;
	}
	public static void main(String[] args) {
		int n=3;
		int m=10;
		int[] w= {3,4,5};
		int[] p= {4,5,6};
		int[][] c=BackPack(m,n,w,p);
//	    for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=m; j++) {
//                System.out.print(c[i][j]+"\t");
//                if(j==m){
//                    System.out.println();
//                }
//            }
//        }
		int[] x=Traceback(c,m,n,w,p);
		for(int i:x) {
			System.out.print(i+" ");
		}
	}
}
