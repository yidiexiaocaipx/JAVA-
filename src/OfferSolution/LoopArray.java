package Solution;

import java.util.Arrays;

public class LoopArray {
	public static int loopArray(int[] arr) {
		int i=0;
	 for(;i<arr.length;i++) {	
		 int[] arr1=Arrays.copyOfRange(arr, i, arr.length);
		 int sum1=0;
		 int sum=0;
		 int j=0;
		 int m=0;
		 for(;j<arr1.length;j++) {
		  sum1+=arr1[j];
		  if (sum1<=0)
		     break;
		 }
		 if(j==arr1.length)
		 {	
			 sum=sum1;
			 for(;m<arr.length-i;m++) {
			   sum+=arr[m];
			   if(sum<=0)
			    break;
			 }
		 }
	    if(m==arr.length-i)
		 break;			 
	 }
	 if(i<arr.length)
	    return i+1;		
	 else 
		 return -1;
	}

	public static void main(String[] args) {
		int[] arr= {0,0,0,0};
		int a=loopArray(arr);
		System.out.println(a);
	}

}
