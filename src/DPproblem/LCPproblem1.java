package DPproblem;

import java.util.Stack;

public class LCPproblem1 {

	public static void LCSLength(int[] x,int[] y) {
		int[][] c=new int[x.length+1][y.length+1];
		int max=0;
		int m=0;
		int n=0;
		Stack<Integer> stack=new Stack<>();
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
					//b[i][j]=1;
				}
				else { 
					c[i][j]=0;
				//	b[i][j]=0;
				}
				if(c[i][j]>max) {
					max=c[i][j];
					m=i;n=j;
				}
				
					
				
			}
		}
		for(int i=m,j=n;c[i][j]!=0;i--,j--) {
			stack.add(x[i-1]);			
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		//return c;
		
	}

	public static void main(String[] args) {
         int[] x= {1,2,4,5,6,7,8,10,7};
         int[] y= {1,2,4,5,8,9,10};
         int[][] b=new int[x.length+1][y.length+1];
         LCSLength(x,y);
	}

}
