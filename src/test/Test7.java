package Thread;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str==null || str.length()==0)
			System.out.println(0);
		StringBuilder s1=new StringBuilder(str);
		StringBuilder s2=new StringBuilder(str).reverse();
		int length=LCSLength(s1,s2);
		if(length==0)
			System.out.println(str.length());
		int num=length/2+length+1;
		System.out.println(num);
		
	}
	public static int LCSLength(StringBuilder x,StringBuilder y) {
		int[][] c=new int[x.length()+1][y.length()+1];
		for(int i=0;i<x.length()+1;i++) {
			c[i][0]=0;
		}
		for(int i=0;i<y.length()+1;i++) {
			c[0][i]=0;
		}
		for(int i=1;i<x.length()+1;i++) {
			for(int j=1;j<y.length()+1;j++) {
				if(x.charAt(i-1)==x.charAt(j-1)) {
					c[i][j]=c[i-1][j-1]+1;
				//	b[i][j]=1;
				}
				else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j]=c[i-1][j];
				//	b[i][j]=2;
				}
				else {
					c[i][j]=c[i][j-1];
				//	b[i][j]=3;
				}
					
				
			}
		}
		return c[x.length()][y.length()];
		
	}
}