package Thread;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int[] arr=new int[t];
       for(int i=0;i<t;i++) {
    	   arr[i]=sc.nextInt();
       }
       int temp=0;
       int value=0;
       
       String[] str=new String[t];
       for(int i=0;i<t;i++) {
    	   int a=2;
    	   temp=arr[i] % 2;
    	   if(temp==0) {
    	   value=arr[i]/2;
    	   while(value>0) {   		   
    		   if((value % 2) !=0) {
    			   str[i]=String.valueOf(value)+" "+String.valueOf(a);
    			   break;
    		   }
    		   else {
    			   a=a*2;
    			   value=value/2;
    		   }		   
    	   }
    	   if(value==0) {
    	      str[i]="No";
    	   }   		 
           }
          else
    		str[i]="No";
       }
       for(int i=0;i<t;i++) {
    	   System.out.println(str[i]);
       }
     //  System.out.println(6/10);
	}
	

}
