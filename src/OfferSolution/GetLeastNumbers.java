package Solution;

import java.util.ArrayList;

public class GetLeastNumbers {

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(input==null || k<=0) { 
			return null;
		}
		if(input.length==0 || k>input.length) {
			return arr;
		}
		if(k==input.length) {
			for(int m=0;m<input.length;m++) {
				arr.add(input[m]);
			}
			return arr;
		}
	    //ArrayList<Integer> arr=new ArrayList<Integer>();
		int start=0;
		int end=input.length-1;
		//int base=input[k];
		int index=partition(input,start,end);
		while(index !=k) {
		if(index<k) {
			start=index+1;
			index=partition(input,start,end);
		}
		else {
			end=index-1;
			index=partition(input,start,end);
		}
		}
		for(int m=0;m<k;m++) {
			arr.add(input[m]);
		}
		return arr;
		
		
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
         int[] input= {4,5,1,6,2,7,3,8,4};
         int k=4;
         ArrayList<Integer> arr=GetLeastNumbers_Solution(input,k);
         for(int i:arr) {
        	 System.out.println(i);
         }
	}

}
