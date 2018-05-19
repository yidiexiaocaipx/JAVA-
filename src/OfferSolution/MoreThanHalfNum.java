package Solution;

public class MoreThanHalfNum {

	public static int MoreThanHalfNum_Solution(int[] array) {
		if(array==null && array.length==0) {
			return 0;
		}
		int start=0;
		int end=array.length-1;
		int k=array.length/2;
		//int base=input[k];
		int index=partition(array,start,end);
		while(index !=k) {
		if(index<k) {
			start=index+1;
			index=partition(array,start,end);
		}
		else {
			end=index-1;
			index=partition(array,start,end);
		}
		}
		if(CheckMoreThanHalf(array[k],array)) {
			return 0;
		}
		return(array[k]);
	}
	public static boolean CheckMoreThanHalf(int num,int[] arr) {
		int length=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				length++;
			}
		}
		if(length*2<=arr.length) {
			flag=true;
		}
		return flag;
	}
	public static int partition(int[] input,int start,int end) {
		int i=start;
		int j=end+1;
		int base=input[start];
		while(true) {
			while(i<end && input[++i]<=base) 
			{
				//if (i==end) break;
				//i++;
			}
			while(j>start && input[--j]>=base) 
			{
			//	if (j==start) break;
				//j--;
			}
			if(i>=j) {
				break;
			}
			swap(input,i,j);
			//arr.add(input[i]);
		}
		swap(input,start,j);
		return j;
	}
	public static void swap(int[] input,int i,int j) {
		int temp=input[i];
		input[i]=input[j];
		input[j]=temp;
	}
	public static void main(String[] args) {
       int[] arr= {1,2,3,2,2,2,5,4};
       System.out.println(MoreThanHalfNum_Solution(arr));
	}

}
