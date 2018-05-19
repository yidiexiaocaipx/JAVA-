package sort;

import java.util.Arrays;

public class BinarySearch {

	public static void findValue(int[] a,int value,int low,int high) {
	   Arrays.sort(a);
//	   boolean flag=false;
	    if(low>high) {
	    	System.out.println("No find");
	    	return;
	    }
		int mid=low+(high-low)/2;
		if(value==a[mid])
		{
//		   flag=true;
		   System.out.println("find:µÚ"+(mid+1)+"Î»  "+value);
		   return;
		}
		else if(value<a[mid]) {
			high=mid;
			findValue(a,value,low,high-1);
		}
		else if(value>a[mid]) {
			low=mid+1;
			findValue(a,value,low,high);
		}
//		if(flag==false)
//		  System.out.println("No find");
//		else
//	      System.out.println("find:"+value);
		
//		if(value<a[mid]) {
//			high=mid;
//			findValue(a,value,low,high-1);
//		}
//		else if(value>a[mid]) {
//			low=mid+1;
//			findValue(a,value,low,high);
//		}
//		else if(value==a[mid])
//			{
//			   flag=true;
//			   System.out.println("find:"+value);
//			}
		
//		if(flag==false) {
//			System.out.println("No find");
//		}
//		else
//			System.out.println("No find");
		
	}
	public static void main(String[] args) {
         int[] a= {110,200,280,300,400,450,500};
         findValue(a,300,0,a.length-1);
	}

}
