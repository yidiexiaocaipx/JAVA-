package one_bitandtwo_bitCharacters;

public class MaximumSubstring {
	public static int MaxSubArray(int[] nums)
	{
//		int i=0;
//		int j=nums.length-1;
//		int sum=0;
//		for(int m=0;i<nums.length;i++)
//		{
//			sum+=nums[m];
//		}
//		int temp1=0;
//		int temp2=0;
//		while(i<=j)
//		{
//			temp1=sum-nums[j];			
//			if(sum<=temp1)
//			{
//				sum=temp1;
//				j--;
//			}
//			temp2=sum-nums[i];
//			if(sum<=temp2)
//			{
//				sum=temp2;
//				i++;
//			}
//		}
//		return sum;
		if (nums==null || nums.length==0)  return 0;
		if(nums.length==1)  return nums[0];
		int max=nums[0];
		int sum=nums[0];
		for(int i=1;i<nums.length;i++)
		{
//			if(sum<0)  sum=nums[i];
//			else  sum+=nums[i];
			sum=Math.max(sum+nums[i], nums[i]);
			max=Math.max(max, sum);

		}
		return max;
	}

	public static void main(String[] args) {
		int[] array= {-2,1,-3,4,-1,2,1,-5,4};
		int a=Integer.MIN_VALUE;
//		System.out.println(MaxSubArray(array));
		System.out.println(a);

	}

}
