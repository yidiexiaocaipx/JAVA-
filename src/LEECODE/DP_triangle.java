package LEECODE;

import java.util.ArrayList;

public class DP_triangle {

	public static int minTotalSum(ArrayList<ArrayList<Integer>> triangle) {
		int sum;
		sum=getSum(triangle,0,0);
		return sum;
	}
	public static int getSum(ArrayList<ArrayList<Integer>> triangle,int l,int k) {
		int sum=triangle.get(l).get(k);
		if(l<triangle.size()-1) {
			sum+=Math.min(getSum(triangle,l+1,k),getSum(triangle,l+1,k+1));
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> list=new ArrayList<>();
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<Integer> arr2=new ArrayList<>();
		ArrayList<Integer> arr3=new ArrayList<>();
		ArrayList<Integer> arr4=new ArrayList<>();
		arr1.add(2);
		arr2.add(3);
		arr2.add(4);
		arr3.add(6);
		arr3.add(5);
		arr3.add(7);
		arr4.add(4);
		arr4.add(1);
		arr4.add(8);
		arr4.add(3);
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		int sum=minTotalSum(list);
		System.out.println(sum);
		
		
		

	}

}
