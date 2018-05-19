package one_bitandtwo_bitCharacters;

public class InsertSearchPosition {

	public static int searchInsert(int[] nums, int target)
	{
//		int i=0;
//		while(i<nums.length && nums[i]<target)
//		{
//			i++;			
//		}
//			return i;
//		if(i==nums.length)
		int low=0;
		int high=nums.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(target==nums[mid]) return mid;
			else if(nums[mid]>target) high=mid-1;
			else low=mid+1;
		}
		
		return low;
	}
	public static void main(String[] args) {
            int[] nums= {1,3,5,6};
	        System.out.println(searchInsert(nums,5));

}
}
