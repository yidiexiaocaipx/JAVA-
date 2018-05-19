package Thread;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=Math.abs(n);
		 int step=StepNum(m);
		 System.out.println(step);
	}
	public static int StepNum(int m) {
		if(m==0) {
			return 0;
		}
		if(m==1) {
			return 1;
		}
		if(m==2) {
			return 2;
		}
		if(m % 2!=0) {
			return(Math.min(StepNum(m-1)+1, StepNum((m+1)/2)+2));
		}
		else {
			return(Math.min(StepNum(m-1)+1, StepNum((m+1)/2)+1));
		}
	}

}
