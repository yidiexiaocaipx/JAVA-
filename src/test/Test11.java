package Thread;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 if(n==0)
			 System.out.println(0);
		 int[] a=new int[n];
		 int count=1;
		 a[0]=1;
		 int index2=0;
		 int index3=0;
		 int index5=0;
		 while(count<n) {
			 int min=min(a[index2]*2,a[index3]*3,a[index5]*5);
			 a[count]=min;
			 while(a[index2]*2<=a[count]) index2++;
			 while(a[index3]*3<=a[count]) index3++;
			 while(a[index5]*5<=a[count]) index5++;
			 count++;
		 }
		 System.out.println(a[n-1]);
		 
	}
	public static int min(int a,int b,int c) {
		int temp=a<b?a:b;
		return temp<c? temp:c;
	}

}
