package Thread;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
//       while(sc.hasNext()) {
//    	   int n=sc.nextInt();
//       }
//       while(sc.hasNext()) {
//    	   int n=sc.nextInt();
//       }
//       int n=sc.nextInt();
//       String str1;
//       String str2;
//       String[] str=new String[3];
//      String nextLine=sc.nextLine();
//       int m=0;
//       while(nextLine !=null && ! nextLine.equals("")) {
//       //String nextLine=sc.nextLine();
//       str[m]=nextLine;
//       nextLine=sc.nextLine();
//       m++;
//       //str2=sc.nextLine();
//       }
//     //  int n=Integer.parseInt(str[0]);
       int n = Integer.valueOf(sc.nextLine());	
      String next = sc.nextLine();
      String next2 = sc.nextLine();
       String[] str3=next.split(" ");
       String[] str4=next2.split(" ");
   //    System.out.println(str[1]);
   //    System.out.println(str[2]);
//       char[] ca1=str1.toCharArray();
//       char[] ca2=str2.toCharArray();
    
       int[] arr1=new int[str3.length];
       int[] arr2=new int[str4.length];
       for(int i=0;i<arr1.length;i++) {
    	   arr1[i]=Integer.parseInt(str3[i]);   	   
       }
       for(int i=0;i<arr2.length;i++) {
    	   arr2[i]=Integer.parseInt(str4[i]);   	   
       }	   
       
       int maxValue=0;
       int minL=Integer.MAX_VALUE;
      // int curValue=0;
      // int sum=0;
       String stt=null;
       int min=0;
       for(int i=0;i<arr1.length;i++) {
    	   if(arr1[i]<min) {
    		   min=arr1[i];
    	   }
       }
       if(n<min) {
    	   System.out.println(0);
       }
       for(int i=0;i<arr1.length;i++) {
    	   int j=i+1;
    	   int sum=arr1[i];
    	    StringBuilder st=new StringBuilder();
    	   if(arr1[i]<=n) {
    	   int curValue=arr2[i];
    	   int curL=arr1[i];
    	   st.append(i);
    	   while(j<arr1.length) {
    		  // sum+=arr1[j];4
    		  // int sum=arr1[i];
    		   sum+=arr1[j];
//    		   if(sum<=n) {
//    			   //sum+=arr1[j];
//    			   curValue+=arr2[j];
//    			   st.append(j);
//    		   }
    		   if(sum>n) {
    			   sum=arr1[i];
    			   curValue=arr2[i];
    			   curL=arr1[i];
    			   st=new StringBuilder(i);
    		   }
    		   else if(sum<=n) {
    			   //sum+=arr1[j];
    			   curValue+=arr2[j];
    			   curL+=arr1[j];
    			   st.append(j);
    		   }
    		   if(curValue>maxValue)
	    	   {
	    		   maxValue=curValue;
	    		   minL=curL;
	    		   stt=st.toString();
	    	   }	 
    		   j++;
    	   }
//	    	   if(curValue>maxValue)
//	    	   {
//	    		   maxValue=curValue;
//	    		   stt=st.toString();
//	    	   }	   
//    	   for(int j=0;j<arr1.length;j++) {
//    		   if()
//    	   }
    	   }
       }
       System.out.print(stt);
      char[] cc=stt.toCharArray();
      for(int i=0;i<cc.length;i++) {
   	   System.out.print((Integer.parseInt(String.valueOf(cc[i]))+1)+" ");   
      }		   
   //    System.out.println(maxValue);
      // System.out.println(str2);
	}

}
