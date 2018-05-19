package DPproblem;

public class LCVProblem {

	public static int maxLCV(int[] a) {
		int b=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(b>0) {
				b+=a[i];
			}
			else
				b=a[i];
			if(b>sum)
				sum=b;
		}
		return sum;
	}
	public static void main(String[] args) {
         int [] a= {1,3,-4,10,-6,10,-10};
         int sum=maxLCV(a);
         System.out.println(sum);
	}

}
