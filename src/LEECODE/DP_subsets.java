package LEECODE;

import java.util.ArrayList;

public class DP_subsets {

	public static ArrayList<ArrayList<Integer>> subSets(int[] S){
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		int[] a=new int[S.length];
		a[0]=1;
		int start=1;
		ArrayList<Integer> ar=new ArrayList();
		ar.add(S[0]);
		arr.add(ar);
		for(int i=1;i<S.length;i++) {
			a[i]=2*a[i-1]+1;
			ArrayList<Integer> ar1=new ArrayList();
			ar1.add(S[i]);
			arr.add(start, ar1);
			ArrayList<Integer> br1=new ArrayList();
			for(int j=start+1;j<start+a[i-1];j++) {				
				br1=ar1;
				br1.addAll(arr.get(j-start-1));
				arr.add(j, br1);
			}
			start=a[i];
		}
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,2,3};
         ArrayList<ArrayList<Integer>> arr=subSets(a);
         for(int i=0;i<arr.size();i++) {
        	 System.out.print("[");
        	 for(int j=0;j<arr.get(i).size();j++) {
        		 if(j!=arr.get(i).size()-1)
        		 System.out.print(arr.get(i).get(j)+",");
        		 else
        			 System.out.print(arr.get(i).get(j)+"]");
        	 }
        	 System.out.println();
         }
	}

}
