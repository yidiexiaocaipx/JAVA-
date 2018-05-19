package Thread;

import java.util.Scanner;

public class TEST1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr=new int[2];
     //   int i=0;
//        int a=0;
//        int b=0;
        while(sc.hasNextInt())
        {
           int  a=sc.nextInt();
           int  b=sc.nextInt();
           int sum=0;
           for(int y=b;y<=a;y++) {
        	 for(int n=b;n<y;n++){
        		for(int m=0;;m++) {
        			if((m*y+n)<=a) {
        				sum++;
        			}
        			else break;
        		}
        	}
        }
          System.out.println(sum);
        }
       // int a=sc.nextInt();
      //  int b=sc.nextInt();
//       int a= arr[0];
//       int b=arr[1];
      //  int m=0;
       // int n=b;

        
	}

}
