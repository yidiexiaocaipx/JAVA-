package Solution;

public class GreatestSumOfSubArray {
    public static int greatestSumOfSubArray(int[] array) {
    	int currentSum=0;
    	int maxSum=Integer.MIN_VALUE;
    	int i=0;
    	for(;i<array.length;i++) {
    		if(currentSum<=0)
    			currentSum=array[i];
    		else
    			currentSum+=array[i];
    		if(currentSum>maxSum)
    			maxSum=currentSum;
    	}
    	return maxSum;
    }
	public static void main(String[] args) {
        int[] arr= {-2,-8,-1,-5,-9};
        System.out.println(greatestSumOfSubArray(arr));
	}

}
