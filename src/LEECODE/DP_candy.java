package LEECODE;

public class DP_candy {

	public static int candy(int[] ratings) {
		if(ratings.length==0 || ratings==null)
			return 0;
		int N=ratings.length;
		if(N==1)
			return 1;
//		if(N==2)
//			return 3;
		int[] candyNum=new int[N];
		for(int i=0;i<N;i++) {
			candyNum[i]=1;
		}
		for(int i=1;i<N;i++) {
			if(ratings[i]>ratings[i-1])
				candyNum[i]=candyNum[i-1]+1;
		}
		for(int j=N-1;j>0;j--) {
			if(ratings[j-1]>ratings[j] && candyNum[j-1]<=candyNum[j]) {
				candyNum[j-1]=candyNum[j]+1;
			}
		}
//		for(int i=1;i<N-1;i++) {
////			if(ratings[i]>ratings[i-1])
////				candyNum[i]=candyNum[i-1]+1;
//			if(ratings[i]>Math.max(ratings[i-1],ratings[i+1])) {
//				candyNum[i]=Math.max(candyNum[i-1], candyNum[i+1])+1;
//			}
//			if(ratings[i]<Math.min(ratings[i-1],ratings[i+1])) {
//				candyNum[i]=1;
//			}
//			else 
//			{
//				if(ratings[i]==ratings[i-1]) {
//					candyNum[i]=candyNum[i-1];
//				}
//				else if(ratings[i]==ratings[i+1]) {
//					candyNum[i]=candyNum[i+1];
//				}
//				else
//					candyNum[i]=Math.min(candyNum[i-1], candyNum[i+1])+1;
//			}
//				
//		}
		int sum=0;
		for(int i=0;i<N;i++)
		{
			sum+=candyNum[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] ratings= {1,2,2};
     int sum=candy(ratings);
     System.out.println(sum);
	}

}
