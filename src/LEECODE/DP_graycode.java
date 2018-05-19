package LEECODE;

import java.util.ArrayList;

public class DP_graycode {

	public static ArrayList<Integer> grayCode(int n){
		ArrayList<Integer> result=new ArrayList<>();
	   if(n<0) {
		   return result;
	   }
	   if(n==0) {
		   result.add(0);
		   return result;
	   }
	   result.add(0);
	   result.add(1);
	   for(int i=2;i<=n;i++) {
		   int size=1<<(i-1);
		   for(int j=result.size()-1;j>=0;j--)
		      result.add(size+result.get(j));
	   }
	   return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		ArrayList arr=grayCode(n);
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}

	}

}
