package Thread;

import java.util.Arrays;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String[] s=str.split(" ");
      int n=Integer.parseInt(s[0]); 
//      if(n==0) {
//    	  System.out
//      }
      int[] arr=new int[n];
      for(int i=1;i<s.length;i++) {
    	  arr[i-1]=Integer.parseInt(s[i]);
      }
      Arrays.sort(arr);
      int i=0;
      for(i=0;i<n;i++) {
    	  if(arr[i] !=i) {
    		  break;
    	  }    		  
      }
      System.out.println(i);
	}

}
